<template>
  <div>
    <h2>{{ teacher.name }}</h2>
    <h3>강의가 있습니까?</h3>
<!--    <p>{{ teacher.lectures.length > 0 ? '있음' : '없음' }}</p>-->
    <p>{{ hasLecture }}</p>
    <p>{{ existLecture() }}</p>
    <p>{{ hasLecture }}</p>
    <p>{{ existLecture() }}</p>
    <button v-on:click="counter++">Counter: {{counter}}</button>
    <h2>이름</h2>
    <p>{{ fullName }}</p>
  </div>
</template>

<script>
import {computed, reactive, ref} from "vue";

export default {
  setup() {
    const teacher = reactive({
      name: '짐코딩',
      lectures: ['HTML/CSS', 'JavaScript', 'Vue3']
    })

    //computed는 처음 렌더링 후 재사용
    const hasLecture  = computed(() => {
      console.log('computed');
      return teacher.lectures.length > 0 ? '있음' : '없음';
    });

    //method는 하이라이트 영역내에 있는 버튼 클릭시 계속 재실행됨
    const existLecture  = () => {
      console.log('method');
      return teacher.lectures.length > 0 ? '있음' : '없음';
    }

    const counter = ref(0);


    //Computed화면에 Set
    const firstName = ref('홍')
    const lastName = ref('길동')

    const fullName = computed({
      get() {
        return firstName.value + ' ' + lastName.value;
      },
      set(value) {
        [firstName.value, lastName.value] = value.split(' ');
      }
    });
    console.log('Console 출력: ', fullName.value);
    fullName.value = '짐 코딩';
    return {
      teacher,
      hasLecture,
      existLecture,
      counter,
      fullName
    }
  }
}
</script>

<style lang="scss" scoped>

</style>