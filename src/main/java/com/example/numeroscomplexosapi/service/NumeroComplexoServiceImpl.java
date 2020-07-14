package com.example.numeroscomplexosapi.service;

import java.io.Serializable;

import org.springframework.stereotype.Service;

import com.example.numeroscomplexosapi.domain.NumeroComplexo;

/*Classe de serviço para operações de números complexos, baseada na interface de serviço
 * @author Khadije El Zein
 *  created on 07/07/2020
 */
@Service
public class NumeroComplexoServiceImpl implements NumeroComplexoService, Serializable{
	
	private static final long serialVersionUID = -7935313979434100787L;

	/*
	 * @param parteReal - parte real do número complexo
	 * @param parteImaginaria - parte imaginária do número complexo
	 * @return número complexo criado
	 */
	@Override
	public NumeroComplexo criarNumeroComplexo(Double parteReal, Double parteImaginaria) {
		return new NumeroComplexo(parteReal,parteImaginaria);
	}
	
	/*
	 * @param numeroUm - primeiro número complexo da adição
	 * @param numeroDois - segundo número complexo da adição
	 * @return número complexo resultante da adição de dois números complexos
	 */
	@Override
	public NumeroComplexo adicionarNumerosComplexos(NumeroComplexo numeroUm, NumeroComplexo numeroDois) {
		Double parteReal = numeroUm.getParteReal() + numeroDois.getParteReal();
		Double parteImaginaria = numeroUm.getParteImaginaria() + numeroDois.getParteImaginaria();
		return new NumeroComplexo(parteReal,parteImaginaria);
	}

	/*
	 * @param numeroUm - primeiro número complexo da multiplicação
	 * @param numeroDois - segundo número complexo da multiplicação
	 * @return número complexo resultante da multiplicação de dois números complexos
	 */
	@Override
	public NumeroComplexo multiplicarNumerosComplexos(NumeroComplexo numeroUm, NumeroComplexo numeroDois) {
		Double parteReal = (numeroUm.getParteReal()* numeroDois.getParteReal()) - 
				(numeroUm.getParteImaginaria() * numeroDois.getParteImaginaria());
		Double parteImaginaria = (numeroUm.getParteReal() * numeroDois.getParteImaginaria()) + 
				(numeroDois.getParteReal()*numeroUm.getParteImaginaria());
		return new NumeroComplexo(parteReal, parteImaginaria);
	}

	/*
	 * @param numero - número complexo para imprimir 
	 * @return número complexo formatado para impressão na tela.
	 */
	@Override
	public String imprimirNumeroComplexo(NumeroComplexo numero) {
		
		String numeroComplexo = numero.getParteReal() + " + " + numero.getParteImaginaria() + " i ";
		System.out.println(numeroComplexo);
		return numeroComplexo;
	}

}
