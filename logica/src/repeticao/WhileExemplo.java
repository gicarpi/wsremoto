package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo {
	
	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Digite seu e-mail").toLowerCase(); 
		
		while (email.contains("@")==false) {
			email = JOptionPane.showInputDialog("Digite e-mail valido").toLowerCase();
		}
		
		System.out.println("Usuario: " + email.substring(0, email.indexOf("@")));
		
		String nome = JOptionPane.showInputDialog("Nome").toLowerCase();
		
		while (nome.length()<3 || nome.length()>15) {
			nome = JOptionPane.showInputDialog("Digite o nome novamente");
		}
		System.out.println("Nome: " + nome);
	}
		

}
