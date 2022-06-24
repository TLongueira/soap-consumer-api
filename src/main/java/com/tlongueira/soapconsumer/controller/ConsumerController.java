package com.tlongueira.soapconsumer.controller;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlongueira.soapconsumer.service.DataAccessService;

import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/convertir")
public class ConsumerController {

	@Autowired
	DataAccessService dataAccessService;

	@ApiOperation(value = "Convertir Numero a Palabras")
	@GetMapping("/numeroapalabras")
	public ResponseEntity<?> convertirAPalabras(@RequestBody BigInteger numero) {
		String resultado = dataAccessService.convertirAPalabras(numero);
		return ResponseEntity.ok(resultado);
	}

	@ApiOperation(value = "Convertir Numero a Dolares")
	@GetMapping("/numeroadolares")
	public ResponseEntity<?> convertirADolares(@RequestBody BigDecimal numero) {
		String resultado = dataAccessService.convertirADolares(numero);
		return ResponseEntity.ok(resultado);
	}
}
