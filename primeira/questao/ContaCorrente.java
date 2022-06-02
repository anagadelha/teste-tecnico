package primeira.questao;

public class ContaCorrente extends Conta{

	@Override
	public void imprimirSaldo() {
		System.out.println("O seu saldo com rendimento é: " + (saldo + (saldo * rendimentoCorrente)));
	}

}
