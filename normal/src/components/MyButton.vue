<template>
  <div class="p-3 bg-danger">
    <button type="button" class="btn btn-primary" v-bind="$attrs">My Button</button>
  </div>
</template>

<script>
export default {
  inheritAttrs: false,
  setup(props, context) {
    // console.log('context.attrs: ', context.attrs);
    // console.log('class: ', context.attrs.class);
    // console.log('id: ', context.attrs.id);
    // console.log('onClick: ', context.attrs.onClick);
    return {}
  }
}
</script>

<style lang="scss" scoped>

</style>