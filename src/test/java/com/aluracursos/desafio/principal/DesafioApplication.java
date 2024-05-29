package com.aluracursos.desafio.principal;

import org.springframework.boot.SpringApplication;

public class DesafioApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesafioApplication.class, args);
        Principal principal = new Principal();
        principal.muestraElMenu();
    }
}