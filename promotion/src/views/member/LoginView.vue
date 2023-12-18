<template>
  <div>
    <h1>LoginView</h1>
    <a @click="goJoinPage">회원가입하기</a>
  </div>
</template>

<script setup>
import router from "@/router";

const goJoinPage = () => {
  router.push('/join')
}
</script>

<style lang="scss" scoped>

</style>