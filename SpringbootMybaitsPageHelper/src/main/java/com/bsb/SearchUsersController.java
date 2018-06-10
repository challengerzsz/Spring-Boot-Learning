package com.bsb;

import com.bsb.entity.User;
import com.bsb.mapper.IUserMapper;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SearchUsersController {

    @Autowired
    private IUserMapper userMapper;


    @GetMapping("/")
    public List<User> findAll() {
        PageHelper.startPage(2, 4);
        List<User> all = userMapper.findAll();
        return all;
    }
}
