package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.SousDossier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SousDossierDao extends JpaRepository<SousDossier, Long> {
    SousDossier findByCode(String code);
    public int deleteByCode(String code);
    }
