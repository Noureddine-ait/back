package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.Dossier;
import com.wilaya.courrierbackwillyia.dao.DossierDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DossierService {
    public Dossier findByCode(String code) {
        return dossierDao.findByCode(code);
    }

@Transactional
    public int deleteByCode(String code) {
        return dossierDao.deleteByCode(code);
    }

    @Autowired
    private DossierDao dossierDao;
}
