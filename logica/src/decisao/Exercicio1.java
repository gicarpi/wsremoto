package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		
		float preco = 80;
		byte diaria = Byte.parseByte(JOptionPane.showInputDialog("Qual a quantidade de diarias?"));
		
		if (diaria>15) {
			System.out.println("Total a pagar: " + (diaria*(preco + 5.5)));
				
		} else if (diaria==15) {
			System.out.println("Total a pagar: " + (diaria*(preco+6)));
		} else if (diaria<15) {
			System.out.println("Total a pagar: " + (diaria*(preco+8)));
			
			
		}
		
				
	}

}
