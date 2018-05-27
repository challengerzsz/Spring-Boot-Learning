package com.bsb.controller;

import com.bsb.pojo.User;
import com.bsb.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private IUserRepository userRepository;

    /**
     * 查询用户列表
     * @return
     */
    @GetMapping(value = "/user/")
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    /**
     * 添加一个用户
     * @param username
     * @param password
     * @return
     */

    @PostMapping(value = "/user/")
    public User addUser(@RequestParam("username") String username,
                        @RequestParam("password") String password) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        return userRepository.save(user);
    }

    @GetMapping(value = "/user/{id}")
    public User queryUser(@PathVariable("id") int id) {
        return userRepository.getOne(id);
    }

    @PutMapping(value = "/user/{id}")
    public void updateUser(@PathVariable("id") Integer id,
                           @RequestParam("username") String username,
                           @RequestParam("password") String password) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);

        userRepository.save(user);
    }

    @DeleteMapping(value = "/user/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }

}
