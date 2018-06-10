package com.bsb.mapper;

import com.bsb.entity.User;

import java.util.List;

public interface IUserMapper {

    List<User> findAll();
}
