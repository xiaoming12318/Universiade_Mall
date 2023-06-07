package cn.edu.service.impl;

import cn.edu.mapping.UserMapping;
import cn.edu.pojo.User;
import cn.edu.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapping userMapping;


    @Override
    public List<User> findAll() {
        return userMapping.findAll();
    }

    @Override
    public void deleteById(int id) {
        userMapping.deleteById(id);
    }

    @Override
    @Transactional
    public void updateById(User user) {
        userMapping.updateById(user);
    }
}
