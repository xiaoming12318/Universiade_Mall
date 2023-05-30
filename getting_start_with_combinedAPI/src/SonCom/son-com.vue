<script setup>
   const emit=defineEmits(['get-message'])
  
  const sendMsg=()=>{
  	//触发自定义事件，并传递参数
  	emit('get-message','this is son msg')
  }
</script>

<template>
      <button @click="sendMsg">sendMsg </button>

</template>