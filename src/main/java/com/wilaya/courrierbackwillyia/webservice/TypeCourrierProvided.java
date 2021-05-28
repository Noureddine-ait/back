package com.wilaya.courrierbackwillyia.webservice;


import com.wilaya.courrierbackwillyia.bean.TypeCourrier;
import com.wilaya.courrierbackwillyia.service.TypeCourrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/typeCourrier")
public class TypeCourrierProvided {

    @GetMapping("/code/{code}")
    public TypeCourrier findByCode(@PathVariable  String code) {
        return typeCourrierService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return typeCourrierService.deleteByCode(code);
    }

    @Autowired
    private TypeCourrierService typeCourrierService ;
}
