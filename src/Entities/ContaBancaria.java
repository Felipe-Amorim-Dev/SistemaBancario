package Entities;


import java.time.*;
import java.util.UUID;

public class ContaBancaria {
	
	private UUID id;
	private int numeroConta;
	private int agencia;	
	private String nomeBanco;
	private Double saldo;
	private LocalDateTime dataHoraCriacao;
		
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}	
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	public LocalDateTime getDataHoraCriacao() {
		return dataHoraCriacao;
	}
	public void setDataHoraCriacao(LocalDateTime dataHoraCriacao) {
		this.dataHoraCriacao = dataHoraCriacao;
	}
	
	
}
