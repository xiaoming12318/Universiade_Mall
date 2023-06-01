package cn.edu.mapping;

import cn.edu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
public interface UserMapping {

    @Select("select * from user_front")
    List<User> findAll();

}
