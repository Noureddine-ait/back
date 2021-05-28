package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.SousTheme;
import com.wilaya.courrierbackwillyia.dao.SousThemeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SousThemeService {


    public SousTheme findByCode(String code) {
        return sousThemeDao.findByCode(code);
    }
@Transactional
    public int deleteByCode(String code) {
        return sousThemeDao.deleteByCode(code);
    }

    @Autowired
    private SousThemeDao sousThemeDao ;

}
