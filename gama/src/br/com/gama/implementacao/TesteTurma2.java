package br.com.gama.implementacao;

public class TesteTurma2 {
	
	public static void main(String[] args) {
		
		Turma turma = new Turma(
				Magica.s("Sigla turma"),
				Magica.s("Periodo"),
				new Curso(
						Magica.s("Sigla curso"),
						"JAVA GAMA",
						true,
						Magica.f("Valor do curso"),
						(byte) 6
						),
				new Aluno(
						"REGINA",
						Magica.i("Matricula"),
						"bruna@gama.academy",
						"1234-4567",
						new Endereco(
								
								)
						),
				new Professor(
						"CLEBERSON",
						"ENGENHEIRO",
						"EXATAS",
						new Endereco(
								
								)
						)
				);
		
		System.out.println(turma.toString());
	
		
		
		
		
		
		
	}

}
