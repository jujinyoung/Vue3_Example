<template>
  <label class="child-classa" style="border: 1px solid black" id="child-id">
    {{label}}
  </label>
  <input v-model="value" type="text"/>
</template>

<script>
import {computed} from "vue";

export default {
  props: ['modelValue', 'label'],
  emits: ['update:modelValue'],
  setup(props, {emit}) {
    const value = computed({
      get() {
        return props.modelValue;
      },
      set(value) {
        emit('update:modelValue', value);
      }
    })
    return {value}
  }
}
</script>

<style lang="scss" scoped>

</style>