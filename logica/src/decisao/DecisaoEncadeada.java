package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Digite a diciplina").toUpperCase();
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 1"));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 2"));
		float media = (n1+n2)/2;
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));


		System.out.println("Média: " + media);
		
			if (media>=6 && faltas<20) {
				System.out.println("Parabéns !\nAprovado na disciplina "+ disciplina);
			}else if (media<4 || faltas>20) {
				System.out.println("Infelizmente você foi reprovado em " + disciplina);
			}else {
				System.out.println("Exame em " + disciplina);
			}
		

			
			
		}
	}

//toUpperCase() deixar tudo maiusculo 
//double numero quebrado 3 casas decimais
// || or       && and