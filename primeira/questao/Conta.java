package primeira.questao;

public abstract class Conta implements InterfaceConta {

	protected String nome, titular;
	protected double saldo, rendimentoPoupanca, rendimentoCorrente;
	
	public Conta () {
		this.nome = "Ana";
		this.titular = "Ana Beatriz M. Gadelha";
		this.saldo = 150.00;
		this.rendimentoPoupanca = 0.05;
		this.rendimentoCorrente = 0.03;
	}
	
	
}
