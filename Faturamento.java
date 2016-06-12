//Solid: Single Responsability 

//Classe com única responsabilidade.
//Aqui certificamos de implementar apenas funcionalidade
//relacionadas com faturamento, outras features devem estar
//em classes separadas.
public class Faturamento implements InterfaceEmpresa {

	private ContaCorrente conta;
	private Cliente cliente;
	
	//soliD = Dependency Inversion
	
	// De acordo com esse princípio nenhuma classe superior deverá depender de classe inferior
	// Como para o faturamento é necessário de conta e cliente, criamos o método abaixo que
	// já seta as variáveis da classe: conta e cliente assim que a função emitirBoleto() é chamada
	// Dessa forma sempre haverá conta e cliente evitando dependências.
	public void setContaECliente(ContaCorrente conta, Cliente cliente)
	{
		this.conta = conta;
		this.cliente = cliente;
	}
	
	@Override
	public void emitirBoleto(ContaCorrente conta, Cliente cliente) {
		setContaECliente(conta, cliente);
		System.out.println(cliente + " seu boleto foi impresso com sucesso!");
	}

	@Override
	public void cancelarPagamento() {
		System.out.println("boleto cancelado com sucesso");
	}
}
