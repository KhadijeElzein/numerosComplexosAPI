package com.example.numeroscomplexosapi.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/*Interface controller para as saídas da API com as operações de números complexos
 * @author Khadije El Zein
 *  created on 07/07/2020
 */
@RequestMapping(NumeroComplexoController.PATH)
public interface NumeroComplexoController {
	static final String PATH = "/numeroscomplexos";
	
	/*
	 * @param realNumeroUm - parte real do primeiro número complexo da adição
	 * @param imaginariaNumeroUm - parte imaginária do primeiro número complexo da adição
	 * @param realNumeroDois - parte real do segundo número complexo da adição
	 * @param imaginariaNumeroDois - parte imaginária do segundo número complexo da adição
	 * @return número complexo resultante da adição de dois números complexos formatado para impressão na tela
	 */
	@GetMapping(path="/adicionar")
	public ResponseEntity<?> adicionarNumerosComplexos(
			@RequestHeader(value="realNumeroUm",required=true) final Double realNumeroUm,
			@RequestHeader(value="imaginariaNumeroUm",required=true) final Double imaginariaNumeroUm,
			@RequestHeader(value="realNumeroDois",required=true) final Double realNumeroDois,
			@RequestHeader(value="imaginariaNumeroDois",required=true) final Double imaginariaNumeroDois
			);
	
	/*
	 * @param realNumeroUm - parte real do primeiro número complexo da multiplicação
	 * @param imaginariaNumeroUm - parte imaginária do primeiro número complexo da multiplicação
	 * @param realNumeroDois - parte real do segundo número complexo da multiplicação
	 * @param imaginariaNumeroDois - parte imaginária do segundo número complexo da multiplicação
	 * @return número complexo resultante da multiplicação de dois números complexos formatado para impressão na tela
	 */
	@GetMapping(path="/multiplicar")
	public ResponseEntity<?> multiplicarNumerosComplexos(
			@RequestHeader(value="realNumeroUm",required=true) final Double realNumeroUm,
			@RequestHeader(value="imaginariaNumeroUm",required=true) final Double imaginariaNumeroUm,
			@RequestHeader(value="realNumeroDois",required=true) final Double realNumeroDois,
			@RequestHeader(value="imaginariaNumeroDois",required=true) final Double imaginariaNumeroDois
			);
}
