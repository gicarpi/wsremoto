package br.com.popsveiculos.teste;

import br.com.popsveiculos.modelo.Veiculo;

public class TesteVeiculo {
	
	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo();
		carro.preencherMontadora("");
		System.out.println(carro.retornarMontadora());
		
		carro.montadora="fiat.toUpperCase()";
		System.out.println(carro.montadora);
		
		
				
	}

}
