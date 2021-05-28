package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.SousDossier;
import com.wilaya.courrierbackwillyia.dao.SousDossierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SousDossierService {


    public SousDossier findByCode(String code) {
        return sousDossierDao.findByCode(code);
    }
@Transactional
    public int deleteByCode(String code) {
        return sousDossierDao.deleteByCode(code);
    }

    @Autowired
    private SousDossierDao sousDossierDao;
}
