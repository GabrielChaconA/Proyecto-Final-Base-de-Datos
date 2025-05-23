package com.example.demo.ProyectoBD;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hola {
   @GetMapping("/Hoola")
    public String hola(){
        return "HOla";
    }
}
