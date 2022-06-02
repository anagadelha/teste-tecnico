package primeira.questao;

public class Main {

	public static void main(String[] args) {
		
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		
		contaCorrente.imprimirSaldo();
		contaPoupanca.imprimirSaldo();

	}

}
