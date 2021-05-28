package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.Dossier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DossierDao extends JpaRepository<Dossier,Long> {
    Dossier findByCode(String code);
    public int deleteByCode(String code);
}
