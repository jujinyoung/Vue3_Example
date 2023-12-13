<template>
  <div>
    <div class="titleGroup">
      <h1 class="pageTitle">이벤트</h1>
      <button class="btn_link" type="button">당첨자 발표</button>
    </div>
    <ul class="nav nav-fill">
      <li class="nav-item">
        <a @click="clickTabs(null)" :class="params.type === null ? 'active' : ''" class="nav-link" href="#">전체</a>
      </li>
      <li class="nav-item">
        <a @click="clickTabs('01')" :class="params.type === '01' ? 'active' : ''" class="nav-link" href="#">체험/리뷰</a>
      </li>
      <li class="nav-item">
        <a @click="clickTabs('02')" :class="params.type === '02' ? 'active' : ''" class="nav-link" href="#">쇼핑혜택</a>
      </li>
      <li class="nav-item">
        <a @click="clickTabs('03')" :class="params.type === '03' ? 'active' : ''" class="nav-link" href="#">제휴혜택</a>
      </li>
    </ul>
  </div>
  <ul class="event-container">
    <li class="pt-3" v-for="event in events" :key="event.id">
      <EventItem :title="event.title"
                 :type="event.type"
                 :start-at="event.startAt"
                 :end-at="event.endAt"
                 :img-path="event.imgPath">
      </EventItem>
    </li>
  </ul>
  <ul class="pagination justify-content-center">
    <li :class="{disabled: !(params._page > 1) }" class="page-item">
      <a class="page-link" @click="--params._page" href="#" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li v-for="page in pageCount" :key="page" class="page-item" :class="params._page === page ? 'active' : ''">
      <a @click="params._page = page"
         class="page-link"
         href="#">
        {{ page }}
      </a>
    </li>
    <li :class="{disabled: !(params._page !== pageCount) }" class="page-item">
      <a class="page-link" @click="++params._page" href="#" aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</template>

<script setup>
import EventItem from "@/views/event/components/EventItem.vue";
import {computed, ref, watchEffect} from "vue";
import {getEventList} from "@/api/eventApi";

const events = ref([]);
const params = ref({
  _sort: 'id',
  _order: 'asc',
  _limit: 3,
  _page: 1,
  type: null
});

const totalCount = ref(0);
const pageCount = computed(() => Math.ceil(totalCount.value / params.value._limit));

const fetchEvents = async () => {
  try {
    const { data, headers } = await getEventList(params.value);
    events.value = data;
    totalCount.value = headers['x-total-count'];
  } catch (error) {
    console.log(error);
  }
}
watchEffect(() => fetchEvents());

const clickTabs = (value) => {
  params.value.type = value;
  params.value._page = 1;
}
</script>

<style scoped>
.titleGroup {
  display: flex;
  margin: 60px 0 30px;
}
.pageTitle {
  width: 1280px;
  margin: 0;
}
.btn_link {
  display: inline-flex;
  align-items: center;
  gap: 5px;
  font-size: 14px;
  line-height: 1.43em;
  color: black;
  flex: none;
}
.btn_link:after {
  display: block;
  content: '';
  width: 16px;
  height: 16px;
  background: url("public/arr_r16_black.png");
}
button {
  overflow: visible;
  cursor: pointer;
  background: none;
  border: 0;
  border-radius: 0;
  outline: none;
}
ul {
  list-style-type: none;
  padding: 0px;
  margin: 0px;
}
.event-container {
  display: flex;
  justify-content: space-around;
  flex-wrap: wrap;
}
.nav .nav-item .nav-link.active {
  border: 1px solid;
  font-weight: bold;
}
.nav .nav-item .nav-link {
  color: black;
  border: 1px #EEEEEE solid;
}
</style>