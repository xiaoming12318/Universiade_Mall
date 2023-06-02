<script setup>
import Edit from './components/Edit.vue'
import axios from 'axios'
import { onMounted,ref } from 'vue';

// TODO: 列表渲染
//1.声明响应式list
const list=ref([])
//2.调用接口获取数据
const getList=async()=>{
  //接口调用
  const res= await axios.get("http://localhost:8080/user")
  console.log(res)
  //3.后端数据复制给list
  list.value=res.data
}

onMounted(()=>
  getList()
)


//4.绑定到table组件

// TODO: 删除功能


// TODO: 编辑功能

</script>

<template>
  <div class="app">
    <el-table :data="list">
      <el-table-column label="ID" prop="id"></el-table-column>
      <el-table-column label="姓名" prop="name" width="150"></el-table-column>
      <el-table-column label="籍贯" prop="birthPlace"></el-table-column>
      <el-table-column label="操作" width="150">
        <template #default>
          <el-button type="primary" link>编辑</el-button>
          <el-button type="danger" link>删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <!-- 分页 -->
  <el-pagination 
    :page-size="20"
    :page-count="11"
    layout="prev,pager,next"
    :total="list.data"
  />
  </div>

  

  <Edit />
</template>

<style scoped>
.app {
  width: 980px;
  margin: 100px auto 0;
}
</style>
