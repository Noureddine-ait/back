package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.TypeCourrier;
import com.wilaya.courrierbackwillyia.dao.TypeCourrierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TypeCourrierService {
    public TypeCourrier findByCode(String code) {
        return typeCourrierDao.findByCode(code);
    }
@Transactional
    public int deleteByCode(String code) {
        return typeCourrierDao.deleteByCode(code);
    }

    @Autowired
    private TypeCourrierDao typeCourrierDao;



}
