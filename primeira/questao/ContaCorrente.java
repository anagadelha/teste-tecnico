package primeira.questao;

public class ContaCorrente extends Conta{

	@Override
	public void imprimirSaldo() {
		System.out.println("O seu saldo com rendimento �: " + (saldo + (saldo * rendimentoCorrente)));
	}

}
