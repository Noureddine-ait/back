package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.SousTheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SousThemeDao extends JpaRepository<SousTheme, Long> {
    SousTheme findByCode(String code);
    public int deleteByCode(String code);
}
