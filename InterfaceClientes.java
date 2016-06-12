//solId: Interface Segregation - Criação de interfaces específicas 
//para os clientes.
// De acordo com essa técnica, o cliente só precisa implementar as funcionalidades
// que forem necessárias.

// Perceba que foi criada outra interface específica para empresa
// uma vez que clientes não precisam de tais métodos

public interface InterfaceClientes {
	
	public void acrescentarDependente(String name);
	

}
