package br.com.banco;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Executavel {

	public static void main(String[] args) throws ParseException {
		//CTRL+F11 RUN
		
		SimpleDateFormat dataFormatada = new SimpleDateFormat("yyyyMMdd");
		
		CDB100 cdb = new CDB100();
		CDB1000 cdbM = new CDB1000();
		CDB10000 cdbDm = new CDB10000();
		Fundos fundos = new Fundos();
		
		Date dataJosias = dataFormatada.parse("19780720");
		Date dataAnderson = dataFormatada.parse("19730322");

		Cliente josias = new Cliente("Josias", "R. Libero Badaro, 32", dataJosias);
		ContaCorrente contaJosias = new ContaCorrente(josias, 3000);
	
		Cliente anderson = new Cliente("Anderson Varejinha", "Av. Liberdade, 1500", dataAnderson);
		ContaCorrente contaAnderson = new ContaCorrente(anderson, 3001);
		
		contaJosias.depositar(10000);
		contaJosias.transferir(100, contaAnderson);
		
		contaJosias.exibirSaldo();
		contaAnderson.exibirSaldo();
		
		contaJosias.investimento(100, cdb);
		contaJosias.resgatar(100);
		contaJosias.exibirExtratoInv();
		
	}

}
