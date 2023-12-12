<template>
  <nav class="py-2 bg-light border-bottom">
    <div class="container d-flex flex-wrap">
      <ul class="nav me-auto" style="padding-left: 400px">
        <li class="nav-item"><a href="#" class="nav-link link-dark px-2 active" aria-current="page">특가</a></li>
        <li class="nav-item"><RouterLink :to="{ name: 'event' }" class="nav-link link-dark px-2">이벤트</RouterLink></li>
        <li class="nav-item"><a href="#" class="nav-link link-dark px-2">베스트</a></li>
        <li class="nav-item"><a href="#" class="nav-link link-dark px-2">쇼케이스</a></li>
        <li class="nav-item"><a href="#" class="nav-link link-dark px-2">라이브</a></li>
        <li class="nav-item"><a href="#" class="nav-link link-dark px-2">FOR ME</a></li>
      </ul>
      <ul class="nav">
        <li class="nav-item"><a href="#" class="nav-link link-dark px-2">ABOUT</a></li>
      </ul>
    </div>
  </nav>

  <div class="b-example-divider"></div>
</template>

<script setup>

</script>

<style scoped>
li.nav-item {
  font-weight: bold;
}
</style>