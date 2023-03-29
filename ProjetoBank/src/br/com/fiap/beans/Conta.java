package br.com.fiap.beans;

public class Conta {
	private double saldo;
	private Cliente nomeCliente;
	
	// CONSTRUCTOR -> vazio
	public Conta() {
		super();
	}
	
	// CONSTRUCTOR -> cheio
	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	// SET & GET
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(Cliente nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
}
