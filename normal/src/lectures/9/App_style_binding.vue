<template>
  <div :style="styleObject">
    Lorem asd asd asd asd asd  sd s d wq d sa dwqds dqw d sa d wqd asd
  </div>
  <button v-on:click="fontSize--">-</button>
  <button v-on:click="fontSize++">+</button>
</template>

<script>
import {computed, reactive, ref} from "vue";

export default {
  setup() {
    // const styleObject = reactive({
    //   color: 'red',
    //   fontSize: '13px'
    // });
    const fontSize = ref(13);
    const styleObject = computed(() => {
      return {
        color: 'red',
        fontSize: fontSize.value + 'px'
      }
    })
    return {
      styleObject,
      fontSize
    }
  }
}
</script>

<style lang="scss" scoped>

</style>