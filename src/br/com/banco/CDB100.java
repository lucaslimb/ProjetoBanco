package br.com.banco;

public class CDB100 implements Produto {

	@Override
	public double investir(double valor) {
		return valor * 0.005;
		
	}

}
