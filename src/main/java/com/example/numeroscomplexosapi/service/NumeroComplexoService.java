package com.example.numeroscomplexosapi.service;

import com.example.numeroscomplexosapi.domain.NumeroComplexo;

/* Interface de serviço para operações com números complexos
 * @author Khadije El Zein
 *  created on 07/07/2020
 */
public interface NumeroComplexoService {

	/*
	 * @param parteReal - parte real do número complexo
	 * @param parteImaginaria - parte imaginária do número complexo
	 * @return número complexo criado
	 */
	NumeroComplexo criarNumeroComplexo(Double parteReal, Double parteImaginaria);
	

	/*
	 * @param numeroUm - primeiro número complexo da adição
	 * @param numeroDois - segundo número complexo da adição
	 * @return número complexo resultante da adição de dois números complexos
	 */
	NumeroComplexo adicionarNumerosComplexos (NumeroComplexo numeroUm, NumeroComplexo numeroDois);
	

	/*
	 * @param numeroUm - primeiro número complexo da multiplicação
	 * @param numeroDois - segundo número complexo da multiplicação
	 * @return número complexo resultante da multiplicação de dois números complexos
	 */
	NumeroComplexo multiplicarNumerosComplexos(NumeroComplexo numeroUm, NumeroComplexo numeroDois);

	/*
	 * @param numero - número complexo para imprimir 
	 * @return número complexo formatado para impressão na tela.
	 */
	String imprimirNumeroComplexo(NumeroComplexo numero);

}
