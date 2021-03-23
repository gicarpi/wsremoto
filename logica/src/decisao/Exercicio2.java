package decisao;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		float preco = Float.parseFloat(JOptionPane.showInputDialog("Qual o preço?"));
		String pagamento = JOptionPane.showInputDialog("Qual a forma de pagamento?");
		String um = "A vista";
		String dois = "A vista cartão";
		String tres = "Duas vezes";
		String quatro = "Tres vezes";
		
		
		if (pagamento = "a vista") {
			System.out.println("Total a pagar: " + (preco*0.9));
			
		} else if (pagamento = 2) {
			System.out.println("Total a pagar: " + preco+(preco*0.95));
			
		} else if (pagamento = 3) {
			System.out.println("Total a pagar: " + preco);
		}
		
		
	}

}
