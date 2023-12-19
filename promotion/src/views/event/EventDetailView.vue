<template>
  <div v-if="eventDetail">
    <component :is="eventDetail"></component>
  </div>
</template>

<script setup>
import {inject, onMounted, ref} from "vue";

const eventDetail = ref(null);

onMounted(async () => {
  try {
    const url = inject('url');
    const component = await import(url);
    eventDetail.value = component.default;
  } catch (error) {
    console.log(error);
  }
});
</script>

<style lang="scss" scoped>

</style>