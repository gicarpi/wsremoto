package br.com.gama.modelo;


public class aluno {
	
	private Endereco endereco;
	private String nome;
	private int matricula;
	private String email;
	private String fone;
	
	public void setAll(Endereco endereco, String nome, int matricula, String email, String fone) {
		this.nome = nome;
		this.matricula = matricula;
		this.email = email;
		this.fone = fone;
		this.endereco;
		
	
	}
	




	
	@Override
	public String toString() {
		return "aluno [endereco=" + endereco + ", nome=" + nome + ", matricula=" + matricula + ", email=" + email
				+ ", fone=" + fone + "]";
	}






	}





	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}






	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	


	
}
