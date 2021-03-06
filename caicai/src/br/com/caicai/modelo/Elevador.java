package br.com.caicai.modelo;

public class Elevador {
	private String nome;
	private byte maximoPessoas;
	private byte andarMaximo;
	private byte andarMinimo;
	private byte andaratual;
	private byte qtpessoas;
	
	public String subir () {
		if (andaratual<andarMAximo) {
			andaratual+=1;
			return
		}
	}
	
	public String descer() {
		if (andaratual>andarMinimo) {
			andaratual-=1;
			return "Descenco para "+ andaratual;
		}
	}
	
	public void entrar(byte qtpessoas) {
		if ((this.qtpessoas+qtpessoas)<=maximoPessoas) {
			this.qtpessoas += qtpessoas;
		}
		
	}
	
	public void inicializar(String pNome, byte pMaximoPessoas, byte pAndarMaximo, byte pAndarMinimo, byte pAndarAtual, byte pQtPessoas) {
		nome= pNome;
		maximoPessoas = pMaximoPessoas;
		andarMaximo = pAndarMaximo;
		andarMinimo = pAndarMinimo;
		andaratual = pAndarAtual;
		qtpessoas = pQtPessoas;
		
		
		
	}
	
	
	@Override
	public String toString() {
		return "Elevador [nome=" + nome + ", maximoPessoas=" + maximoPessoas + ", andarMaximo=" + andarMaximo
				+ ", andarMinimo=" + andarMinimo + ", andaratual=" + andaratual + ", qtpessoas=" + qtpessoas + "]";
	}
	
	
	

}
