package cn.edu.web;

import cn.edu.common.R;
import cn.edu.pojo.User;
import cn.edu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("user")
@Slf4j
@CrossOrigin(origins = "*",maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public List<User> findALl(){
        List<User> result = userService.findAll();
        log.info(String.valueOf(result));
        return result;
    }

    @DeleteMapping("/{id}")
    public R deleteById(@PathVariable Integer id){
        System.out.println(id);
        if (id==100){
            return R.error("查无此ID");
        }
        userService.deleteById(id);
        return R.success("删除成功");
    }

    @PutMapping
    public String updateById(@RequestBody User user){
        System.out.println(user);
        userService.updateById(user);
        return "成功调试update方法";
    }

}
