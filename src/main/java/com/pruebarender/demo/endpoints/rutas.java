package com.pruebarender.demo.endpoints;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class rutas {

    @GetMapping("/holaMundo")
    public String holaMundo(){
        System.out.println("Hello World2 consola ");
        return "Hola Mundo 3";

    }
}
