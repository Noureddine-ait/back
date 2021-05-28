package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository <User,Long> {
    User findByLogin (String Login);
    public int deleteByLogin(String code);
}
