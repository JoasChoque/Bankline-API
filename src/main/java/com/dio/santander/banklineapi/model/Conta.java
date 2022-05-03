package com.dio.santander.banklineapi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Conta {
	@Column (name= "conta_numero")
	private Long num;
	
	@Column (name = "conta_saldo")
	private Double salario;
	
	
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
}
