public class ContaQueTentaDaUmDescontoMaior extends ContaCorrente {


	// sOlid Fechado para modificações, aberto para expansão (Open Closed Principle
	// (OCP))

	// Supomos que o desenvolvedor criou esta classe com o intuito de inserir
	// um crédito maior do que o descrito na Classe ContaCorrente, sobrescrevendo
	// o método inserirCredito();
	
	// Entretanto esse desenvolvedor não conseguirá sobrescrever, 
	// uma vez que o método responsável está fechado pra modificação do código
	// fonte, através da palavra reservado "final". Removendo a palavra "final"
	// a inserção do crédito poderia ser burlada e o código abaixo funcionaria

	// public void inserirCredito()
	// {
	// System.out.println("Inserir crédito de R$1000,00");
	// }

}
