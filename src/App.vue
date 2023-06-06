<script setup>
import Edit from './components/Edit.vue'
import axios from 'axios'
import { onMounted,ref } from 'vue';
import {ElMessage,ElMessageBox} from 'element-plus';
// TODO: 列表渲染
//1.声明响应式list
const list=ref([])
//2.调用接口获取数据
const getList=async()=>{
  //接口调用
  const res= await axios.get("http://localhost:8080/user")
  //3.后端数据复制给list
  list.value=res.data
}

onMounted(()=>
  getList()

)




// TODO: 删除功能
//1.获取当前行id


const deleteItem=async(id)=>{
  console.log(id)
  //2.通过id调用删除接口
    ElMessageBox.confirm(
      '是否确定删除',
      '警告',
      {
        confirmButtonText:"确定",
        cancelButtonText:'取消'
      }
    ).then(async ()=>{
      const res=await axios.delete(`http://localhost:8080/user/${id}`)
      if(res.data.code!=1){
        ElMessage({
          message:`操作失败:${res.data.msg}`,
          type:'error'
        })
      }else{
        console.log(res.data)
        ElMessage({
          message:res.data.data,
          type:'success'
        })
        getList()
      }
       
      }
    ).catch(()=>{
        ElMessage({
          message:'取消操作',
          type:'info'
        })
    }
    )
   }
  
 



//3.更新最新的列表

// TODO: 编辑功能

</script>

<template>
  <div class="app">
    <!-- //4.绑定到table组件 -->
    <el-table :data="list">
      <el-table-column label="ID" prop="id"></el-table-column>
      <el-table-column label="姓名" prop="name" width="150"></el-table-column>
      <el-table-column label="籍贯" prop="birthPlace"></el-table-column>
      <el-table-column label="操作" width="150">
        <template #default ={row}>
          <el-button type="primary" link>编辑</el-button>
          <el-button type="danger" link @click="deleteItem(row.id)">删除</el-button>
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
