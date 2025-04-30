package com.microservicio.inventario.inventario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaMundo {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "¡Hola, mundo desde Spring Boot!";
    }
    
}
