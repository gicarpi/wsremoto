package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao {
	
	public static void main(String[] args) {
		
		String nome= "";
		short idade=0;
		short qtMaior=0;
		short totalIdades;
		short qtdepessoas=0;
		String nomemais="";
		short idademais=0;						
		do {
			nome = JOptionPane.showInputDialog("Digite seu nome");
			idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
			qtdepessoas+=1;
			totalIdades += idade;
			if (idade>=18) {
				qtMaior+=1;
			}
			
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Exercicio 2 ", JOptionPane.YES_NO_OPTION)==0);
		JOptionPane.showMessageDialog(null, "Maiores de idade: "+ qtMaior);
		JOptionPane.showMessageDialog(null, "Media de idade: " + totalIdades/qtdepessoas);
		
	}

}
