package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.SousDossier;
import com.wilaya.courrierbackwillyia.service.SousDossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/sousDossier")
public class SousDossierProvided {

    @GetMapping("/code/{code}")
    public SousDossier findByCode(@PathVariable String code) {
        return sousDossierService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return sousDossierService.deleteByCode(code);
    }

    @Autowired
    private SousDossierService sousDossierService ;
}
