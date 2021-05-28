package com.wilaya.courrierbackwillyia.dao;

import com.wilaya.courrierbackwillyia.bean.TypeCourrier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCourrierDao extends JpaRepository<TypeCourrier, Long> {

    TypeCourrier findByCode(String code);
    public int deleteByCode(String code);

}
