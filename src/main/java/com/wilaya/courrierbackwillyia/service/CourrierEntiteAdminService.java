package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.CourrierEntiteAdmin;
import com.wilaya.courrierbackwillyia.dao.CourrierEntiteAdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourrierEntiteAdminService {


    public List<CourrierEntiteAdmin> findByCourrierRef(String ref) {
        return courrierEntiteAdminDao.findByCourrierRef(ref);
    }

    public int deleteByCourrierRef(String ref) {
        return courrierEntiteAdminDao.deleteByCourrierRef(ref);
    }

    public List<CourrierEntiteAdmin> findByEntiteAdminCode(String code) {
        return courrierEntiteAdminDao.findByEntiteAdminCode(code);
    }

    public int deleteByEntiteAdminCode(String code) {
        return courrierEntiteAdminDao.deleteByEntiteAdminCode(code);
    }

    public Optional<CourrierEntiteAdmin> findById(Long aLong) {
        return courrierEntiteAdminDao.findById(aLong);
    }

    @Autowired
    private CourrierEntiteAdminDao courrierEntiteAdminDao ;
}
