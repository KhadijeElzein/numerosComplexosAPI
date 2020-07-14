package com.example.numeroscomplexosapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.numeroscomplexosapi.domain.NumeroComplexo;
import com.example.numeroscomplexosapi.service.NumeroComplexoService;

/*Classe de controller, saída da API para operações com números complexos, baseada na interface controller
 * @author Khadije El Zein
 *  created on 07/07/2020
 */
@RestController
public class NumeroComplexoControllerImpl implements NumeroComplexoController {
	@Autowired
	private NumeroComplexoService service;
	
	/*
	 * @param realNumeroUm - parte real do primeiro número complexo da adição
	 * @param imaginariaNumeroUm - parte imaginária do primeiro número complexo da adição
	 * @param realNumeroDois - parte real do segundo número complexo da adição
	 * @param imaginariaNumeroDois - parte imaginária do segundo número complexo da adição
	 * @return número complexo resultante da adição de dois números complexos formatado para impressão na tela
	 */
	@Override
	public ResponseEntity<?> adicionarNumerosComplexos(Double realNumeroUm, Double imaginariaNumeroUm,
			Double realNumeroDois, Double imaginariaNumeroDois) {
		NumeroComplexo numeroUm = service.criarNumeroComplexo(realNumeroUm, imaginariaNumeroUm);
		NumeroComplexo numeroDois = service.criarNumeroComplexo(realNumeroDois, imaginariaNumeroDois);
		NumeroComplexo numero = service.adicionarNumerosComplexos(numeroUm, numeroDois);
		return ResponseEntity.ok().body(service.imprimirNumeroComplexo(numero));
	}

	/*
	 * @param realNumeroUm - parte real do primeiro número complexo da multiplicação
	 * @param imaginariaNumeroUm - parte imaginária do primeiro número complexo da multiplicação
	 * @param realNumeroDois - parte real do segundo número complexo da multiplicação
	 * @param imaginariaNumeroDois - parte imaginária do segundo número complexo da multiplicação
	 * @return número complexo resultante da multiplicação de dois números complexos formatado para impressão na tela
	 */
	@Override
	public ResponseEntity<?> multiplicarNumerosComplexos(Double realNumeroUm, Double imaginariaNumeroUm,
			Double realNumeroDois, Double imaginariaNumeroDois) {
		NumeroComplexo numeroUm = service.criarNumeroComplexo(realNumeroUm, imaginariaNumeroUm);
		NumeroComplexo numeroDois = service.criarNumeroComplexo(realNumeroDois, imaginariaNumeroDois);
		NumeroComplexo numero = service.multiplicarNumerosComplexos(numeroUm, numeroDois);
		return ResponseEntity.ok().body(service.imprimirNumeroComplexo(numero));
	}

}
