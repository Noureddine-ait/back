package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.SousTheme;
import com.wilaya.courrierbackwillyia.service.SousThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/sousTheme")
public class SousThemeProvided {

    @GetMapping("/code/{code}")
    public SousTheme findByCode(@PathVariable String code) {
        return sousThemeService.findByCode(code);
    }

    @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return sousThemeService.deleteByCode(code);
    }

    @Autowired
    private SousThemeService sousThemeService ;
}
