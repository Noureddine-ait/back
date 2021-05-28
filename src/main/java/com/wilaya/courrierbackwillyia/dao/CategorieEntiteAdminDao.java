package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.CategorieEntiteAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieEntiteAdminDao extends JpaRepository <CategorieEntiteAdmin,Long>{
    CategorieEntiteAdmin findByCode(String code);
    public int deleteByCode(String code);
}
