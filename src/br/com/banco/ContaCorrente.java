package br.com.banco;

import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {

	private double saldoInv;

	public ContaCorrente(Cliente cliente, int numeroConta) {
		super(cliente, numeroConta);
	}

	public void investimento(double valor, Produto produto) {
		//CDB100->0.5%a.m CDB1000->0.7%a.m CDB10000->1%a.m FUNDOS->1.5%a.m
		double rendimento, total;
		if (this.sacar(valor)) {
			rendimento = produto.investir(valor);
			total = valor + rendimento;
			saldoInv += total;
		}
	}

	public void resgatar(double valor) {
		if (valor <= saldoInv) {
			saldoInv -= valor;
			this.saldo += valor;
		}
		else
			System.out.println("Insuficiente");
	}
	
	public void exibirExtratoInv() {
		JOptionPane.showMessageDialog(null, 
				"Cliente: " + this.cliente.getNome() + 
				"\n Data de nascimento: " + this.cliente.getDataNascimento() + 
				"\n Cliente desde: " + this.dataAbertura + 
				"\n Saldo: " + this.saldo +
				"\n Saldo Investimento: " + this.saldoInv +
				"\n Saldo Total: " + (this.saldoInv+this.saldo));
	}

}