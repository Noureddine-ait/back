package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.CategorieEntiteAdmin;
import com.wilaya.courrierbackwillyia.service.CategorieEntiteAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/categorieEntiteAdmin")
public class CategorieEntiteAdminProvided {

    @GetMapping("/code/{code}")
    public CategorieEntiteAdmin findByCode(@PathVariable String code) {
        return categorieEntiteAdminService.findByCode(code);
    }
@DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return categorieEntiteAdminService.deleteByCode(code);
    }

    @Autowired
    private CategorieEntiteAdminService categorieEntiteAdminService;
}
