package br.com.bank.implementacaoo;

import br.com.bankofoz.modelo.Cliente;
import br.com.bankofoz.modelo.Conta;
import br.com.bankofoz.modelo.Corrente;
import br.com.bankofoz.modelo.Poupanca;
import br.com.bankofoz.util.Magica;

public class TesteConta {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(
				Magica.i("ID"),
				Magica.s("Nome"),
				Magica.s("CPF"),
				Magica.s("Fone")
				);
		Corrente conta = new Corrente();
		if (Magica.b("Abrir conta corrente?")==true) {
					
			Conta conta = new Corrente(
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					Magica.f("Saldo"));
		
			
		}else {
			Conta = new Poupanca(
					(short) Magica.i("Numero"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia"),
					Magica.f("Saldo")
					cliente,
					Magica.f("Rendimento"));
			
			
		}
		System.out.println(conta);
		System.out.println(conta.sacar(1000));
		System.out.println(conta.verificarSaldo());
		
		
		
				
	}

}
