<template>
  <section class="container">
    <div class="page_top_area">
      <h2>뷰티포인트 회원가입</h2>
      <p>뷰티포인트 통합 아이디로 아모레퍼시픽 모든 브랜드의 온/오프 매장 서비스를 이용하실 수 있습니다.<br/>
        (만 14세 이상 부터 가입 가능합니다.)</p>
      <h3>회원가입 인증 방식을 선택해주세요.</h3>
    </div>
    <div class="join_main">
      <strong>회원가입 인증 방식을 선택해주세요.</strong>
      <div class="btn_joins">
        <a href="javascript:;"><i class="ico i_phone"></i>휴대폰 인증</a>
      </div>
    </div>
  </section>
</template>

<script setup>

</script>

<style scoped>
.ico.i_phone {
  background-image: url("/icon_mobile.png");
  position: absolute;
  left: 25px;
  top: 50%;
  margin-top: -22px;
  width: 29px;
  height: 45px;
  //background: no-repeat 0 0;
  background-size: 29px auto;
}
.btn_joins a {
  font-size: 18px;
  position: relative;
  display: block;
  margin-top: 15px;
  padding-left: 73px;
  height: 80px;
  line-height: 80px;
  font-weight: 500;
  border-radius: 6px;
  border: solid 1px #d3d3d3;
  text-decoration-line: none;
  color: black;
}
.btn_joins {
  padding-bottom: 30px;
  margin-bottom: 30px;
  border-bottom: 1px solid #f0f0f0;
}
.join_main {
  padding: 0 0 30px;
}
.page_top_area {
  padding: 10px 0 20px;
}
.container {
  padding: 10px 20px 40px;
  max-width: 520px;
  margin: 0 auto;
}
</style>