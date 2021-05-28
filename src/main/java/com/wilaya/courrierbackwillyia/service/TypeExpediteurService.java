package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.TypeExpediteur;
import com.wilaya.courrierbackwillyia.dao.TypeExpediteurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TypeExpediteurService {
    public TypeExpediteur findByCode(String code) {
        return TypeExpediteurDao.findByCode(code);
    }
@Transactional
    public int deleteByCode(String code) {
        return TypeExpediteurDao.deleteByCode(code);
    }

    @Autowired
    private TypeExpediteurDao TypeExpediteurDao ;
}
