<script setup>
      import {inject} from 'vue'
      const message=inject("parentMessage")
      const count=inject("count")
      const setCount=inject("set_count")
      const emit=defineEmits(['get-message'])
      console.log(count)
      
 
</script>

<template>
      <button @click="setCount">底层setCount </button>
      <div>底层组件</div>
      <div>{{ message }}</div>
      <div>{{ count}}</div>
</template>