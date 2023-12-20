<template>
  <div v-if="eventDetail">
    <component :is="eventDetail"></component>
  </div>
</template>

<script setup>
import { onMounted, ref } from "vue";
import {useCounterStore} from "@/stores/counter";

const eventDetail = ref(null);

onMounted(async () => {
  try {
    const store = useCounterStore();
    const component = await import(store.url);
    eventDetail.value = component.default;
  } catch (error) {
    console.log(error);
  }
});
</script>

<style lang="scss" scoped>

</style>