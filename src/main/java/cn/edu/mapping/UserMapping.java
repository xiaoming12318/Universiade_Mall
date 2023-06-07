package cn.edu.mapping;

import cn.edu.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
public interface UserMapping {

    @Select("select * from user_front")
    List<User> findAll();

    @Delete("delete from user_front where id=#{id}")
    void deleteById(int id);

    @Update("update user_front set name=#{user.name},birth_place=#{user.birthPlace} where id=#{user.id}")
    void updateById(@Param("user") User user);
}
