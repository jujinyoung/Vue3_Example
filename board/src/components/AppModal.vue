<script setup>
defineProps({
  show: Boolean,
  title: String
});
defineEmits(['close']);
</script>

<template>
  <!-- Modal -->
  <div v-if="show">
    <div class="modal-backdrop fade show"></div>
    <div class="modal fade show d-block"
         tabindex="-1"
         aria-labelledby="exampleModalLabel"
         aria-hidden="true"
    >
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <slot name="header">
              <h1 class="modal-title fs-5" id="exampleModalLabel">{{ title }}</h1>
              <button type="button"
                      class="btn-close"
                      data-bs-dismiss="modal"
                      aria-label="Close"
                      @click="$emit('close')"
              ></button>
            </slot>
          </div>
          <div class="modal-body">
            <slot></slot>
          </div>
          <div class="modal-footer">
            <slot name="actions"></slot>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

</style>