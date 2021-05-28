package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.EntiteAdmin;
import com.wilaya.courrierbackwillyia.dao.EntiteAdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EntiteAdminService {
    public EntiteAdmin findByCode(String code) {
        return entiteAdminDao.findByCode(code);
    }
@Transactional
    public int deleteByCode(String code) {
        return entiteAdminDao.deleteByCode(code);
    }

    @Autowired
    private EntiteAdminDao entiteAdminDao;
}
