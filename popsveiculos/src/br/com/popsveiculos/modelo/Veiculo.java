package br.com.popsveiculos.modelo;

public class Veiculo {
	
	private String montadora;
	private float valor;
	private short velocidadeAtual;
	private boolean statu;
	private short velocidadeMaxima;
	private String modelo;
	
	// sintaxe dos métodos
	
	
	public void preencherValor(float param) {
		if(param>0) {
			valor=param;
		}
	}
	public String retornarModelo() {
		return modelo;
	}
	public void preencherModelo(String param) {
		modelo=param.toUpperCase();
	}
	public String retornarMontadora() {
		return montadora;
	}
	public void preencherMontadora(String param) {
		montadora = param;
				
	}
	
	
	
	
	
	
	

}
