package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.Expediteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpediteurDao extends JpaRepository<Expediteur, Long> {
    Expediteur findByCode(String code);
    public int deleteByCode(String code);
}
