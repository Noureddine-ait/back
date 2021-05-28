package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.CourrierEntiteAdmin;
import com.wilaya.courrierbackwillyia.service.CourrierEntiteAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public class CourrierEntiteAdminProvided {

    @GetMapping("courrier-ref/ref/{ref}")
    public List<CourrierEntiteAdmin> findByCourrierRef(@PathVariable String ref) {
        return courrierEntiteAdminService.findByCourrierRef(ref);
    }
    @DeleteMapping("courrier-ref/ref/{ref}")
    public int deleteByCourrierRef(@PathVariable String ref) {
        return courrierEntiteAdminService.deleteByCourrierRef(ref);
    }
    @GetMapping("entiteadmin-code/ref/{ref}")
    public List<CourrierEntiteAdmin> findByEntiteAdminCode(@PathVariable String code) {
        return courrierEntiteAdminService.findByEntiteAdminCode(code);
    }
    @DeleteMapping ("entiteadmin-code/ref/{ref}")
    public int deleteByEntiteAdminCode(@PathVariable String code) {
        return courrierEntiteAdminService.deleteByEntiteAdminCode(code);
    }
    @GetMapping("/id/{id}")
    public Optional<CourrierEntiteAdmin> findById(@PathVariable  Long id) {
        return courrierEntiteAdminService.findById(id);
    }

    @Autowired
   private CourrierEntiteAdminService courrierEntiteAdminService;
}
