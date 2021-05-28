package com.wilaya.courrierbackwillyia.service;

import com.wilaya.courrierbackwillyia.bean.Theme;
import com.wilaya.courrierbackwillyia.dao.ThemeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ThemeService {
    public Theme findByCode(String code) {
        return themeDao.findByCode(code);
    }
@Transactional
    public int deleteByCode(String code) {
        return themeDao.deleteByCode(code);
    }

    @Autowired
    private ThemeDao themeDao;
}
