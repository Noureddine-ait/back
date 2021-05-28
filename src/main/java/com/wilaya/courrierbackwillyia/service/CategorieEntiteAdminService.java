package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.CategorieEntiteAdmin;
import com.wilaya.courrierbackwillyia.dao.CategorieEntiteAdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategorieEntiteAdminService {
    @Autowired
    private CategorieEntiteAdminDao categorieEntiteAdminDao;


    public CategorieEntiteAdmin findByCode(String code) {
        return categorieEntiteAdminDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return categorieEntiteAdminDao.deleteByCode(code);
    }
}
