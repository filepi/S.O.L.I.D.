public class ContaCorrente extends ContaBancaria {

	protected final void inserirCredito()
	{
		System.out.println("200 reais creditado em sua conta");
	}
	
	@Override
	public void imprimirSaldoDaConta() {
		System.out.println("implementação da Conta Corrente!");
	}
	
}
