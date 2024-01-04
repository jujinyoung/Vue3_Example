<template>
  <section id="contents">
    <h2 class="pageTitle">장바구니</h2>
    <div class="contWrap">
      <div class="orderContents">
        <!-- 상품 정보 -->
        <div class="orderWrap">
          <div class="cartArea">
            <div class="cartListChk">
              <label class="inputChk" for="selCartSeqAll">
                <input type="checkbox" id="selCartSeqAll">
                <span>전체선택</span>
              </label>
              <div class="btnRight">
                <button type="button" class="btnType7s">선택삭제</button>
              </div>
            </div>
            <form id="cartForm">
              <div class="cartList">
                <ul>
                  <li class="li_relateProd_one">
                    <p class="relatedInfoTxt">립밤/핸드크림 2개이상<br/></p>
                    <div class="pdtRow">
                      <div class="cell pdtChk">
                        <label class="inputChk onlyType" for="selCartSeq0">
                          <span>선택</span>
                        </label>
                      </div>
                      <div class="cell pdtImg">
                        <a href="javascript:;">
                          <img src="../../../public/event_1.jpg">
                          <div class="overlay"></div>
                        </a>
                      </div>
                      <div class="cell pdtInfo">
                        <div class="pdtState"></div>
                        <div class="pdtName">
                          <a href="javascript:;">마이 퍼퓸드핸드크림 [대용량]80mL</a>
                        </div>
                        <div class="pdtAlt"></div>
                        <div class="selectArea">
                          <button class="selTit" type="button">04 댄싱 데이지</button>
                        </div>
                      </div>
                      <div class="cell pdtCount">
                        <div class="countArea">
                          <button type="button" class="btnMinus">수량 빼기</button>
                          <input type="text" class="pdtQty">
                          <button type="button" class="btnPlus"></button>
                        </div>
                        <div class="cell pdtPrice">
                          <div>
                              <span class="price">
                                <span class="num">8,400</span>
                              </span>
                            <span class="point">+84p</span>
                          </div>
                        </div>
                        <div class="cell pdtDel">
                          <button type="button" class="btnDel">삭제</button>
                        </div>
                      </div>
                    </div>
                  </li>
                </ul>
              </div>
            </form>
          </div>
        </div>
        <!-- 우측 네비 -->
        <div class="totalPayment">
          <div class="inner">
            <div class="box">

              <section class="orderPrice">
                <h4 class="subTitle2">결제정보(<em>0</em>)</h4>
                <dl>
                  <dt>주문금액</dt>
                  <dd><span class="num">0</span>원</dd>
                </dl>
                <dl>
                  <dt>배송비</dt>
                  <dd>무료</dd>
                </dl>
                <dl>
                  <dt>적립 예정 뷰티포인트 <button type="button" class="btnTooltip">툴팁</button></dt>
                  <dd><span class="num">0</span>&nbsp;P</dd>
                </dl>
                <dl class="totalPrice">
                  <dt>결제 예정 금액</dt>
                  <dd><span class="num">0</span>원</dd>
                </dl>
              </section>
            </div>
            <button type="button" class="btnType4xl" onclick="javascript:;">주문하기</button>
          </div>
        </div>
      </div>
    </div>
  </section>
</template>

<script setup>

</script>

<style scoped>
button {
  overflow: visible;
  cursor: pointer;
  border: 0;
  border-radius: 0;
  color: inherit;
  outline: none;
}
em {
  font-style: normal;
}
#contents {
  display: flex;
  flex-direction: column;
  width: 1280px;
  margin: 0 auto;
}
.pageTitle {
  width: 1280px;
  margin: 60px auto 30px;
  font-weight: 300;
  font-size: 38px;
  line-height: 1.11;
}
.contWrap {
  width: 1280px;
  margin: 0 auto;
}
.orderContents {
  display: flex;
  justify-content: space-between;
  align-items: flex-start;
  position: relative;
  margin-top: 30px;
}
.orderContents .orderWrap {
  position: relative;
  width: 890px;
}

/*상품 상단 체크박스 영역 */
.orderWrap .cartListChk {
  display: flex;
  align-items: center;
  position: relative;
  height: 30px;
  margin: 0 0 20px;
}
.orderWrap .cartListChk .inputChk {
  font-size: 16px;
  position: relative;
  display: inline-block;
  margin-right: 25px;
  padding-left: 30px;
  line-height: 20px;
  cursor: pointer;
}
.inputChk input {
  position: absolute;
  z-index: -1;
  opacity: 0;
}
.inputChk input:checked + span:after {
  background-color: #0f4138;
  border-color: #0f4138;
}
.inputChk input:checked + span:after {
  background: url("public/bg_checkBox_on.png") no-repeat 50% 50%;
}
.inputChk span:after {
  top: 0;
  left: 0;
  width: 20px;
  height: 20px;
  background: url("public/bg_checkBox_off.png") no-repeat 50% 50%;
  transition: all .2s;
}

/*우측 네비 영역 시작*/
.orderContents .totalPayment {
  position: sticky;
  top: 100px;
  width: 320px;
}
.orderContents .totalPayment .inner {
  width: 320px;
  background: #fff;
}
.totalPayment .orderPrice {
  padding: 30px 25px 35px;
  border: 1px solid #eee;
}
.totalPayment .orderPrice .subTitle2 {
  margin: 0 0 20px;
}
.subTitle2 {
  font-weight: 600;
  font-size: 22px;
  line-height: 1.55;
}
.totalPayment .orderPrice dl {
  display: flex;
  justify-content: space-between;
  align-items: center;
  margin: 0 0 15px;
  font-size: 16px;
  color: #333;
  text-align: right;
}
.totalPayment .orderPrice dt {
  display: flex;
  align-items: center;
}
.totalPayment .orderPrice dd {
  display: inline-block;
  font-weight: 500;
}
.totalPayment .orderPrice .num {
  font-weight: 600;
}
.totalPayment .orderPrice .totalPrice {
  margin: 25px 0 0;
  padding: 20px 0 0;
  border-top: 1px solid #eee;
}
.totalPayment .orderPrice dl {
  display: flex;
  justify-content: space-between;
  align-items: center;
  font-size: 16px;
  color: #333;
  text-align: right;
}
.totalPayment .orderPrice .totalPrice dd {
  display: flex;
  align-items: center;
  font-weight: 600;
  font-size: 18px;
  color: #FF0000;
}
.totalPayment .orderPrice .totalPrice dd .num {
  font-weight: 700;
  font-size: 24px;
}
.btnTooltip {
  flex: none;
  display: inline-block;
  width: 16px;
  height: 16px;
  margin-left: 6px;
  vertical-align: middle;
  font-size: 0;
  background: url("public/ico_tooltip.png") no-repeat 50% 50%;
}
.totalPayment .btnType4xl {
  width: 100%;
  height: 60px;
  margin: 15px 0 0;
  font-size: 16px;
  background: #00BC70;
  color: #fff;
}
/*우측 네비 영역 종료*/

/* 상품 */
.cartList {
  border-top: 2px solid #000;
  border-bottom: 1px solid #eee;
}
.orderWrap .cartList > ul > li {
  padding: 40px 0;
  border-top: 1px solid #F5F5F5;
}
.orderWrap .cartList .relatedInfoTxt {
  margin-bottom: 60px;
  font-weight: 600;
  font-size: 18px;
  line-height: 1.33;
  color: #000;
}
.orderWrap .cartList .pdtRow {
  display: flex;
  position: relative;
}
.orderWrap .cartList .pdtRow .pdtChk {
  margin-right: 15px;
  justify-content: flex-start;
}
.orderWrap .cartList .pdtRow .cell {
  display: flex;
  flex-direction: column;
}
.onlyType {
  width: 20px;
  height: 20px;
  padding: 0;
  margin: 0;
  font-size: 0;
}
.inputChk input {
  position: absolute;
  z-index: -1;
  opacity: 0;
}
.onlyType span {
  position: absolute;
  top: 0;
  left: 0;
  font-size: 0;
}
.orderWrap .cartList .pdtRow .pdtImg {
  position: relative;
  flex: none;
  width: 100px;
  height: 133px;
}
.orderWrap .cartList .pdtRow .cell {
  display: flex;
  flex-direction: column;
  justify-content: center;
}
.orderWrap .cartList .pdtRow .pdtImg a img
,.pdtRow .pdtImg a {
  position: relative;
  width: 100%;
  height: 100%;
}
.orderWrap .overlay {
  display: block;
  position: absolute;
  left: 0;
  top: 0;
  z-index: 2;
  width: 100%;
  height: 100%;
}
.orderWrap .cartList .pdtRow .pdtInfo {
  flex: 1;
  justify-content: start;
  padding: 0 50px 0 20px;
}
.orderWrap .cartList .pdtState {
  display: flex;
  gap: 0 3px;
  margin: 0 0 10px;
}
.orderWrap .cartList .pdtName {
  margin: 0 0 10px;
  font-size: 16px;
  line-height: 1.25;
  color: #000;
}
.orderWrap .cartList .pdtName a {
  font-size: inherit;
  line-height: inherit;
  color: inherit;
}
.orderWrap .cartList .pdtAlt {
  margin-top: 15px;
  line-height: 18px;
}
.orderWrap .cartList .pdtRow .pdtInfo .selectArea {
  width: 80%;
  margin: 20px 0 0;
}
.selectArea {
  position: relative;
  display: inline-block;
  vertical-align: middle;
}
.selectArea .selTit {
  display: inline-flex;
  align-items: center;
  justify-content: space-between;
  width: 100%;
  height: 42px;
  padding: 0 15px;
  border: 1px solid #eee;
  text-align: left;
  font-size: 14px;
}
.selectArea .selTit::after {
  content: "";
  display: block;
  width: 16px;
  height: 16px;
  margin-left: 20px;
  transform: rotate(90deg);
  background: url("public/arr_r16_black.png") no-repeat center;
}
</style>