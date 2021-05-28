package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.User;
import com.wilaya.courrierbackwillyia.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    public User findByLogin(String Login) {
        return userDao.findByLogin(Login);
    }
@Transactional
    public int deleteByLogin(String code) {
        return userDao.deleteByLogin(code);
    }

    @Autowired
    private UserDao userDao;

}

