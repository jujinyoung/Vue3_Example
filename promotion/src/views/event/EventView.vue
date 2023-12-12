<template>
  <div>
    <div class="titleGroup">
      <h1 class="pageTitle">이벤트</h1>
      <button class="btn_link" type="button">당첨자 발표</button>
    </div>
    <ul class="nav nav-pills nav-fill">
      <li class="nav-item">
        <a class="nav-link active" aria-current="page" href="#">전체</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">체험/리뷰</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">쇼핑혜택</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">제휴혜택</a>
      </li>
    </ul>
  </div>
</template>

<script setup>

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
</style>