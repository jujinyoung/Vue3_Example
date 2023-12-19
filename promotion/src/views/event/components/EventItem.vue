<template>
  <div @click="goDetailPage(props.id)" class="event-item">
    <img :src="imgPath" alt="이벤트 이미지">
    <span class="sticker">{{ eventType }}</span>
    <div>
      <p class="date">{{ startAt }} ~ {{ endAt }}</p>
      <p class="name">{{ title }}</p>
    </div>
  </div>
</template>

<script setup>
import {computed, provide} from "vue";
import router from "@/router";

const props = defineProps({
  id: {
    type: String,
    required: true
  },
  title: {
    type: String,
    required: true
  },
  type: {
    type: String,
    required: true
  },
  startAt: {
    type: String,
    required: true
  },
  endAt: {
    type: String,
    required: true
  },
  imgPath: {
    type: String,
    required: true
  },
  url: {
    type: String,
    required: true
  }
})

const eventType = computed(() => {
  if (props.type === '01') return '체험/리뷰';
  else if (props.type === '02') return '쇼핑혜택';
  else if (props.type === '03') return '제휴혜택';
  else return '오류'
});
provide('url', props.url);
const goDetailPage = id => {
  router.push({
    name: 'eventDetail',
    params: {
      id
    }
  });
}
</script>

<style scoped>
.sticker {
  position: absolute;
  top: 10px;
  left: 10px;
  background-color: black;
  color: white;
  padding: 5px;
  border-radius: 5px;
  font-size: 10px;
}
.event-item {
  position: relative;
  //border: 1px solid #ddd;
  margin: 10px;
  padding: 10px;
  height: 300px;
}
.event-item img {
  width: 100%;
  height: 200px;
}
.event-item h4 {
  margin: 10px 0;
}
.date {
  display: block;
  margin: 20px 0 5px;
  font-size: 14px;
  line-height: 1.43em;
  letter-spacing: -0.01em;
  color: #666666;
  opacity: 0.8;
}
.name {
  margin-top: 5px;
  font-weight: 600;
  font-size: 16px;
  line-height: 1.38em;
  color: black;
  overflow: hidden;
  text-overflow: ellipsis;
  word-wrap: break-word;
}

</style>