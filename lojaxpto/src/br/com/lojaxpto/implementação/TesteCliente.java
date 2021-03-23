package br.com.lojaxpto.implementação;

import javax.swing.JOptionPane;

import br.com.lojaxpto.modelo.Cliente;
import br.com.lojaxpto.modelo.PessoaFisica;
import br.com.lojaxpto.modelo.PessoaJuridica;

public class TesteCliente {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		if (JOptionPane.showInputDialog("Digite <F> para fisica our qqer coisa para Juridica").toUpperCase().equals("F")){
				
				cliente = new PessoaFisica(
						"NOME PF",
						"EMAIL@PF.COM.BR",
						"12345678956",
						"1146685");
		
	}else {
		cliente = new PessoaJuridica(
				"NOME PJ",
				"EMAIL@PJ.COM.BR",
				"123456488649654/55",
				"CONTATO",
				"123.123.123");
	}
		
		System.out.println(cliente.toString());
		System.out.println(cliente.getDocumentos());
		
		
				
		
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
