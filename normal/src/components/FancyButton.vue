<template>
  <article>
    <div>
      <slot name="header">1111</slot>
    </div>
    <div>
      <slot>asdwq</slot>
    </div>
    <div>
      <slot name="footer">22222</slot>
    </div>
  </article>
</template>

<script>
import { ref } from 'vue';

export default {
  setup() {
    const fancyMessage = ref('Fancy Message');
    return { fancyMessage };
  },
};
</script>

<style scoped>
.fancy-btn {
  color: #fff;
  background: linear-gradient(315deg, #42d392 25%, #647eff);
  border: none;
  padding: 5px 12px;
  margin: 5px;
  border-radius: 8px;
  cursor: pointer;
}
</style>
