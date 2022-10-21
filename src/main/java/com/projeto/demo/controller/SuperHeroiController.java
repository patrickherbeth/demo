package com.projeto.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.demo.service.SuperHeroiService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController @RequestMapping("algoritimo") @Api(value = "algoritimo", tags = "Algoritimo do projeto") public class SuperHeroiController {

    @Autowired private SuperHeroiService superHeroiService;

    @ApiOperation(value = "Classificação super-heroi.") @GetMapping(value = "/superheroi", produces = "application/json") @ResponseBody public ResponseEntity<String> superheroi(
            @RequestParam int valor[]) throws IOException {

        superHeroiService.lerArquivoCsv();
        superHeroiService.criarLista();
        superHeroiService.imprimirCodigoSuperHeroi();
        superHeroiService.imprimirNomeSuperHeroi();
        superHeroiService.posicaoChegada();

        return new ResponseEntity<>("Sucesso", HttpStatus.OK);

    }

}
