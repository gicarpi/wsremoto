package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Digite a diciplina").toUpperCase();
		float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 1"));
		float n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Nota 2"));
		float media = (n1+n2)/2;


		System.out.println("M�dia: " + media);
		if (media>=6) {
			System.out.println("Parab�ns !\nAprovado na disciplina "+ disciplina);
		}

		if (media<4) {
			System.out.println("Infelizmente voc� foi reprovado em " + disciplina);
		}
		if (media>=4 && media<6) {
			System.out.println("Exame em " + disciplina);

		}


















	}

}

//toUpperCase() deixar tudo maiusculo 
//double numero quebrado 3 casas decimais
// || or       && and