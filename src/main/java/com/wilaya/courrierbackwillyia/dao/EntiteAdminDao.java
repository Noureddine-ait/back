package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.CategorieCourrier;
import com.wilaya.courrierbackwillyia.bean.EntiteAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntiteAdminDao  extends JpaRepository<EntiteAdmin, Long> {


    EntiteAdmin findByCode(String code);
    public int deleteByCode(String code);
}
