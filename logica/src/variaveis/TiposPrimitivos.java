package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		String time1 = JOptionPane.showInputDialog("Digite o Primeiro Time");
		String time2 = JOptionPane.showInputDialog("Digite o segundo time");
		double entrada= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da entrada"));
		int publico = Integer.parseInt(JOptionPane.showInputDialog("Digite o Público"));
		double total = entrada*publico;
		
		System.out.printf("No jogo entre %s x %s a arregadação foi de: R$ %.2f", time1, time2, total);
		
		
	}

}
