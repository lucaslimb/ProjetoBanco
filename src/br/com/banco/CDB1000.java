package br.com.banco;

public class CDB1000 implements Produto {

	@Override
	public double investir(double valor) {
		return valor * 0.007;
		
				
	}

	
}
