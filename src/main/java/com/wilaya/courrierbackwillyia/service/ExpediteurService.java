package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.Expediteur;
import com.wilaya.courrierbackwillyia.dao.ExpediteurDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ExpediteurService {


    public Expediteur findByCode(String code) {
        return expediteurDao.findByCode(code);
    }
@Transactional
    public int deleteByCode(String code) {
        return expediteurDao.deleteByCode(code);
    }


    @Autowired
    private ExpediteurDao expediteurDao;
}
