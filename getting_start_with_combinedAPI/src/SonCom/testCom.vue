<script setup>
    import {ref,defineExpose} from 'vue'
    import sonCom from './son-com.vue'
    const name=ref('test name')
    const setName=()=>{
        name.value='test new name'
    }
    defineExpose({
        name,setName
    })
</script>

<template>
    <div>中间组件</div>
    <sonCom/>

</template>

