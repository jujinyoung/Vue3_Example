<template>
  <main>
    <header class="py-3 border-bottom">
      <div class="container justify-content-center header">
        <a href="/" class="align-items-center mb-3 mb-lg-0 me-lg-auto text-decoration-none">
          <span class="fs-4 site-name" style="color:#21C583">Innisfree</span>
        </a>
        <form class="search-bar d-flex mt" role="search">
          <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
          <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
        <li><RouterLink :to="{ name: 'login' }" class="login text-decoration-none"><i class="bi bi-box-arrow-in-right"></i>로그인</RouterLink></li>
<!--        <a href="javascript:;" class="login text-decoration-none" style="margin-left: 20px"> <i class="bi bi-box-arrow-out-right"></i>로그아웃</a>-->
        <li><RouterLink :to="{ name: 'myPage' }" class="myPage text-decoration-none" style="margin-left: 20px"><i class="bi bi-person"></i>마이페이지</RouterLink></li>
        <li><RouterLink :to="{ name: 'cart' }" class="cart text-decoration-none" style="margin-left: 20px"><i class="bi bi-cart"></i>장바구니</RouterLink></li>
      </div>
    </header>
    <TheGnbMenu></TheGnbMenu>
  </main>
</template>

<script setup>
import TheGnbMenu from "@/layouts/TheGnbMenu.vue";

</script>

<style scoped>
.header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 20px;
}

.site-name {
  flex: 1;
}

.search-bar {
  flex: 2;
  margin-left: 250px;
}

.login, .logout {
  margin-left: 100px;
}
.logout, .login, .myPage, .cart {
  color: black;
}
li {
  list-style-type: none;
}
</style>