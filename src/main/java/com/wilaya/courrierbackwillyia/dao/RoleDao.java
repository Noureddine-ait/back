package com.wilaya.courrierbackwillyia.dao;


import com.wilaya.courrierbackwillyia.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface RoleDao extends JpaRepository<Role, Long>{

    Role findByCode(String Code);
    public int deleteByCode(String code);


}
