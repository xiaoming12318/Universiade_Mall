package cn.edu.web;

import cn.edu.common.R;
import cn.edu.pojo.User;
import cn.edu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    public List<User> findALl(){
        List<User> result = userService.findAll();
        log.info(String.valueOf(result));
        System.out.println(result);
        return result;
    }
}
