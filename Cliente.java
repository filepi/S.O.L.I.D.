public class Cliente implements InterfaceClientes {

	protected ContaCorrente conta;
	private String nome;
	
	public Cliente (String nome)
	{
		this.nome = nome;
	}
	public ContaCorrente getConta() {
		return conta;
	}

	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}

	public String toString()
	{
		return nome;
	}
	
	@Override
	public void acrescentarDependente(String name) {
		System.out.println("Dependente: " + name + " acrescentado.");
	}
}