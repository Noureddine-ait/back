package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.Dossier;
import com.wilaya.courrierbackwillyia.service.DossierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/dossier")
public class DossierProvided {
    @GetMapping("/code/{code}")
    public Dossier findByCode(@PathVariable String code) {
        return dossierService.findByCode(code);
    }

  @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return dossierService.deleteByCode(code);
    }

    @Autowired
    private DossierService dossierService;
}

