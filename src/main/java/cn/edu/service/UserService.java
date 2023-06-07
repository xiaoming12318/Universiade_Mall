package cn.edu.service;

import cn.edu.pojo.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void deleteById(int id);

    void updateById(User user);
}
