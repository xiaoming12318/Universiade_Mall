package cn.edu.service.impl;

import cn.edu.mapping.UserMapping;
import cn.edu.pojo.User;
import cn.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapping userMapping;


    @Override
    public List<User> findAll() {
        return userMapping.findAll();
    }
}
