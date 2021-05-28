package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.Expediteur;
import com.wilaya.courrierbackwillyia.service.ExpediteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/expediteur")
public class ExpediteurProvided {
    @GetMapping("/code/{code}")
    public Expediteur findByCode(@PathVariable String code) {
        return expediteurService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return expediteurService.deleteByCode(code);
    }

    @Autowired
    private ExpediteurService expediteurService;
}
