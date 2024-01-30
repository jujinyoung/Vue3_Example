<template>
  <h1>Home Page</h1>
  <button @click="goAboutPage">About 페이지로 이동</button>

  <button type="button" @click="openModal">모달 열기</button>
  <AppModal :show="show" title="게시글" @close="closeModal">
    <template #default>
      <p>제목: </p>
      <p>내용: </p>
      <p>등록일: </p>
    </template>
    <template #actions>
      <button type="button"
              class="btn btn-secondary"
              data-bs-dismiss="modal"
              @click="closeModal"
              >닫기</button>
    </template>
  </AppModal>
</template>

<script setup>
import { useRoute, useRouter } from "vue-router";
import AppModal from "@/components/AppModal.vue";
import {ref} from "vue";

const router = useRouter();
const route = useRoute();
console.log('route.name: ', route.name);
console.log('route.path: ', route.path);
const goAboutPage = () => router.push('about');

//modalTest
const show = ref(false);
const openModal = () => {
  show.value = true;
}
const closeModal = () => {
  show.value = false;
}
</script>

<style lang="scss" scoped>

</style>