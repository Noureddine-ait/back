package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.CategorieCourrier;
import com.wilaya.courrierbackwillyia.service.CategorieCourrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/categorieCourrier")
public class CategorieCourrierProvided {

    @GetMapping("/code/{code}")
    public CategorieCourrier findByCode(@PathVariable String code) {
        return categorieCourrierService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return categorieCourrierService.deleteByCode(code);
    }

    @Autowired
    private CategorieCourrierService categorieCourrierService ;
}
