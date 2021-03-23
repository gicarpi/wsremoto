package br.com.lojaxpto.modelo;

public class PessoaFisica extends Cliente {
	
	private String cpf;
	private String rg;
	
	public String getDocumentos() {
		return cpf+ "-" + rg;
	}
	

	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String nome, String email, String cpf, String rg) {
		super(nome, email);
		this.cpf = cpf;
		this.rg = rg;
	}	
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", rg=" + rg + ", toString()=" + super.toString() + "]";
	}
	
	public String getCpf() {
		return cpf;

	}

	
	
	
	

}
