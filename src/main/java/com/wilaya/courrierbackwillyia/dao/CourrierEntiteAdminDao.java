package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.CourrierEntiteAdmin;
import com.wilaya.courrierbackwillyia.bean.TraitementCourrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourrierEntiteAdminDao extends JpaRepository<CourrierEntiteAdmin, Long> {

    List<CourrierEntiteAdmin> findByCourrierRef(String ref);
    int deleteByCourrierRef(String ref);
    List<CourrierEntiteAdmin> findByEntiteAdminCode(String code);
    int deleteByEntiteAdminCode(String code);


}
