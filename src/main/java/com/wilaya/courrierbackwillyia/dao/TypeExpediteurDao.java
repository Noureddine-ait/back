package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.TypeExpediteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeExpediteurDao extends JpaRepository<TypeExpediteur, Long> {
    TypeExpediteur findByCode(String code);
    public int deleteByCode(String code);
}
