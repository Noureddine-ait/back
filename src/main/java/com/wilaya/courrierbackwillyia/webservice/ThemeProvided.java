package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.Theme;
import com.wilaya.courrierbackwillyia.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/theme")
public class ThemeProvided {
    @Autowired
    private ThemeService themeService;

@GetMapping("/code/{code}")
    public Theme findByCode(@PathVariable String code) { return themeService.findByCode(code); }

  @DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return themeService.deleteByCode(code);
    }
}
