<template>
  <h1>Home Page</h1>
  <button @click="goAboutPage">About 페이지로 이동</button>
</template>

<script setup>
import { useRoute, useRouter } from "vue-router";

const router = useRouter();
const route = useRoute();
console.log('route.name: ', route.name);
console.log('route.path: ', route.path);
const goAboutPage = () => router.push('about');
</script>

<style lang="scss" scoped>

</style>