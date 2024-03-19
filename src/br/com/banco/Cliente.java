package br.com.banco;

import java.util.Date;

public class Cliente {

	// atributos
	private String nome, endereco;
	private Date dataNascimento; // CTRL+SHIFT+O import

	// construtor CTRL+3 generate constructor using fields
	public Cliente(String nome, String endereco, Date dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
	}

	// metodos (getter/setter) CTRL+3
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
