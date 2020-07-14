package com.example.numeroscomplexosapi.domain;

import java.io.Serializable;
/*Classe de domínio, definição de números complexos
 * @author Khadije El Zein
 *  created on 07/07/2020
 */
public class NumeroComplexo implements Serializable {
	private static final long serialVersionUID = 1443078057109075945L;
	private Double parteReal;
	private Double parteImaginaria;
	
	/*
	 * @param parteReal - parte real do número complexo
	 * @param parteImaginaria - parte imaginária do número complexo
	 */
	public NumeroComplexo(Double parteReal, Double parteImaginaria) {
		super();
		this.parteReal = parteReal;
		this.parteImaginaria = parteImaginaria;
	}
	
	public NumeroComplexo() {
		super();
	}

	public Double getParteReal() {
		return parteReal;
	}
	public void setParteReal(Double parteReal) {
		this.parteReal = parteReal;
	}
	public Double getParteImaginaria() {
		return parteImaginaria;
	}
	public void setParteImaginaria(Double parteImaginaria) {
		this.parteImaginaria = parteImaginaria;
	}
	
}
