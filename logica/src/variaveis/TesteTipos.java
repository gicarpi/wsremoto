package variaveis;

import javax.swing.JOptionPane;

public class TesteTipos {
	
	public static void main(String[] args) {
		String produto = JOptionPane.showInputDialog("Digite o nome do prduto");
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));
		float imposto = Float.parseFloat(JOptionPane.showInputDialog("Digite o Imposto"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitário"));
		float totimpos = (imposto/100)*valor;
		
		System.out.println("Valor com imposto: " + (totimpos+valor));
		System.out.println("Valor do imposto: " + totimpos);
		System.out.println("Total com imposto: " + (totimpos+valor)*quantidade);
		System.out.println("Total sem imposto: " + (valor*quantidade));

		
		
	}

}
