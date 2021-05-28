package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThemeDao extends JpaRepository<Theme,Long> {
    Theme findByCode(String code);
    public int deleteByCode(String code);
}
