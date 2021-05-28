package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.CategorieCourrier;
import com.wilaya.courrierbackwillyia.dao.CategorieCourrierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategorieCourrierService {


    public CategorieCourrier findByCode(String code) {
        return categorieCourrierDao.findByCode(code);
    }
    @Transactional
    public int deleteByCode(String code) {
        return categorieCourrierDao.deleteByCode(code);
    }

    @Autowired
    private CategorieCourrierDao categorieCourrierDao;
}
