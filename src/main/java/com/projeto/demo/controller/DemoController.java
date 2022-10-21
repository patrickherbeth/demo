package com.projeto.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.demo.service.DemoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("algoritimo")
@Api(value = "algoritimo", tags = "Algoritimo do projeto")
public class DemoController {

	@Autowired
	private DemoService demoService;

	@ApiOperation(value = "Buscar resultados.")
	@GetMapping(value = "/buscar", produces = "application/json")
	@ResponseBody
	public ResponseEntity<List<String>> buscarCep(@RequestParam int valor[]) {

		int matriz[][] = demoService.gerarMatriz();

		List<String> resultado = demoService.buscar(matriz, valor);

		return new ResponseEntity<List<String>>(resultado, HttpStatus.OK);

	}

}
