<template>
  <div class="event-item">
    <img :src="imgPath" alt="이벤트 이미지">
    <span class="sticker">{{ eventType }}</span>
    <div>
      <p class="date">{{ startAt }} ~ {{ endAt }}</p>
      <p class="name">{{ title }}</p>
    </div>
  </div>
</template>

<script setup>
import {computed} from "vue";

const props = defineProps({
  title: {
    type: String
  },
  type: {
    type: String
  },
  startAt: {
    type: String
  },
  endAt: {
    type: String
  },
  imgPath: {
    type: String
  }
})

const eventType = computed(() => {
  if (props.type === '01') return '체험/리뷰';
  else if (props.type === '02') return '쇼핑혜택';
  else if (props.type === '03') return '제휴혜택';
  else return '오류'
})
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