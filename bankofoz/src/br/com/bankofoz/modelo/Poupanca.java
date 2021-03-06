package br.com.bankofoz.modelo;

public class Poupanca extends Conta {
	
	private float rendimento;
	
	public void credicarRendimentos() {
		setSaldo(getSaldo() + getSaldo()*(rendimento/100));		
	}

	
	@Override
	public String toString() {
		return "poupanca [rendimento=" + rendimento + ", " + super.toString() + "]";
	}

	public Poupanca(short numero, byte digito, short agencia, float saldo, Cliente cliente, float rendimento) {
		super(numero, digito, agencia, saldo, cliente);
		this.rendimento = rendimento;
	}

	public Poupanca() {
		super();
	}

	public float getRendimento() {
		return rendimento;
	}

	public void setRendimento(float rendimento) {
		this.rendimento = rendimento;
	}
	

}
