package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.TypeExpediteur;
import com.wilaya.courrierbackwillyia.service.TypeExpediteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/typeExpediteur")
public class TypeExpediteurProvided {
    @GetMapping("/code/{code}")
    public TypeExpediteur findByCode( @PathVariable String code) {
        return typeExpediteurService.findByCode(code);
    }
    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return typeExpediteurService.deleteByCode(code);
    }

    @Autowired
    private TypeExpediteurService typeExpediteurService ;
}
