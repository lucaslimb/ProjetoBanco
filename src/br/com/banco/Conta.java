package br.com.banco;

import java.util.Date;

import javax.swing.JOptionPane;

public class Conta {

	//atributos
	protected Cliente cliente;
	protected int numeroConta;
	protected double saldo;
	protected Date dataAbertura = new Date();
	
	//construtor
	public Conta(Cliente cliente, int numeroConta) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
	}
	
	//metodos
	//sacar
	public boolean sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		return false;
	}
	//depositar
	public void depositar(double valor) {
		this.saldo += valor;
	}	
	//transferir
	public void transferir(double valor, Conta conta) {
		if(this.sacar(valor)) {
			conta.depositar(valor);
		}
	}
	//saldo
	public void exibirSaldo() {
		JOptionPane.showMessageDialog(null, 
			"Cliente: " + this.cliente.getNome() + 
			"\n Data de nascimento: " + this.cliente.getDataNascimento() + 
			"\n Cliente desde: " + this.dataAbertura + 
			"\n Saldo: " + this.saldo);
	}	
	
}
