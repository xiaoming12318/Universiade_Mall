<script setup>
	import {ref,onMounted,provide, reactive} from 'vue'
  import testCom from './SonCom/testCom.vue'
 	//获取ref对象
	const h1Ref=ref(null)

  const comRef=ref(null)
  const state =reactive({count:100})
  provide("parentMessage","这是父组件通过provide传过来的消息")
  provide("count",state)
  const setCount=()=>{
    state.count=90
  }

  provide("set_count",setCount)

  setTimeout(()=>{
    state.count=50
    
  },3000)

  
</script>

<template>
  <!-- //通过ref标识绑定ref对象 -->
	<h1 ref="h1Ref">顶层组件</h1>
	<h1 ref="h1Ref">顶层{{ state.count }}</h1>
  <testCom ref="comRef"/>
</template>
