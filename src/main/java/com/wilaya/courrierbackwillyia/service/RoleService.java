package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.Role;
import com.wilaya.courrierbackwillyia.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RoleService {
    public Role findByCode(String Code) {
        return roleDao.findByCode(Code);
    }
@Transactional
    public int deleteByCode(String code) {
        return roleDao.deleteByCode(code);
    }

    @Autowired
    private RoleDao roleDao;
}
