package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome");
		byte idade = Byte.parseByte(JOptionPane.showInputDialog("Idade"));
		
		if (idade>=18 && idade<70) {
			System.out.println("Voto obrigatorio");
		}
		
		if (idade==17 || idade==16 || idade>=70) {
			System.out.println("Voto Facultativo");
		}
		if (idade<16) {
			System.out.println("Não pode votar");
		}
		
		
	}

}
