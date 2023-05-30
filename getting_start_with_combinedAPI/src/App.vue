<script setup>
  import {ref} from 'vue'
 	import SonCom from './SonCom/son-com.vue'
    const messages=ref("this is responsive data")
    
    const getMessageFromSon=(msg)=>{
    	console.log(`messageFromSon:${msg}`)
    }
</script>



<template>
 <SonCom @get-message="getMessageFromSon"/>
</template>
