package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.EntiteAdmin;
import com.wilaya.courrierbackwillyia.service.EntiteAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/entiteAdmin")
public class EntiteAdminProvided {

    @GetMapping("/code/{code}")
    public EntiteAdmin findByCode(@PathVariable String code) {
        return entiteAdminService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return entiteAdminService.deleteByCode(code);
    }

    @Autowired
    private EntiteAdminService entiteAdminService ;
}
