package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.Role;
import com.wilaya.courrierbackwillyia.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/role")
public class RoleProvided {
    @Autowired
    private RoleService roleService;
@GetMapping("/code/{code}")
    public Role findByCode(@PathVariable String Code) {
        return roleService.findByCode(Code);
    }
@DeleteMapping("/code/{code}")
    public int deleteByCode(@PathVariable String code) {
        return roleService.deleteByCode(code);
    }
}
