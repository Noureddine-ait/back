package com.wilaya.courrierbackwillyia.webservice;

import com.wilaya.courrierbackwillyia.bean.User;
import com.wilaya.courrierbackwillyia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("application/user")
public class UserProvided {
    @Autowired
    private UserService userService;

@GetMapping ("/login/{login}")
    public User findByLogin( @PathVariable String Login) {
        return userService.findByLogin(Login);
    }

@DeleteMapping("/login/{login}")
    public int deleteByLogin(@PathVariable String code) {
        return userService.deleteByLogin(code);
    }
}
