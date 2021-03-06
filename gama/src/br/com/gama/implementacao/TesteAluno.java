package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Endereco;

public class TesteAluno {
	
	public static void main(String[] args) {	
		Endereco endereco = new Endereco();
		endereco.setLogradouro("RUA DOUTOR MANOEL DE ABRE");
		endereco.setNumero("171");
		endereco.setComplemento("Casa");
		endereco.setBairro("Olimpico");
		endereco.setCidade("S?O CAETANO");
		endereco.setCep("09570-360");
			
		br.com.gama.modelo.aluno aluno = new Aluno ();
		aluno.setEmail(Endereco);
		aluno.setEmail(JOptionPane.showInputDialog("Email").toLowerCase());
		aluno.setFone(JOptionPane.showInputDialog("Fone"));
		aluno.setNome(JOptionPane.showInputDialog("Nome").toUpperCase());
		aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula")));
				System.out.println("Nome: "+ aluno.getNome());
		System.out.println("Email: "+ aluno.getEmail());
		System.out.println("Fone: "+ aluno.getFone());
		System.out.println("Matricula: "+ aluno.getNome());
		System.out.println("Endereco: " + aluno.getEndereco());
		
		br.com.gama.modelo.aluno aluno2 = new Aluno();
		aluno2.setAll(
				endereco,
				JOptionPane.showInputDialog("Nome 2 ").toUpperCase(),
				Integer.parseInt(JOptionPane.showInputDialog("Matricula 2").toUpperCase()),
				JOptionPane.showInputDialog("Email 2").toLowerCase(),
				JOptionPane.showInputDialog("Telefeno 2"));
		
		System.out.println(alun2.toString());
		
		System.out.println("Bairro: " + aluno.getEndereco().getBairro());
		System.out.println("Cidade: " + aluno.getEndereco().getCidade());
		

	}

}
