import java.util.ArrayList;
import java.util.List;

public class Inicio {

	
	public static void main(String[] args){
		
		Cliente cliente = new Cliente("Felipe Barbosa");
		System.out.println(cliente + " criado com sucesso");
		
		ContaBancaria contaCorrente= new ContaCorrente();
		ContaBancaria contaPoupanca = new ContaPoupanca();
		List<ContaBancaria> listaDeContas = new ArrayList<ContaBancaria>();
		listaDeContas.add(contaCorrente);
		listaDeContas.add(contaPoupanca);
		
		// soLid: Liskov Substitution
		
		// Pelo código abaixo vê-se que é possível chamar imprimirSaldoDaConta()
		// das classes de ContaCorrente e ContaPoupança diretamente pela classe
		// superior, ContaBancaria. Quando podemos substituir a classe filha
		// pela classe pai, sem problemas, atendemos ao princípio de substituiçao
		// de Liskov
		
		for	(ContaBancaria conta: listaDeContas)
		{
			conta.imprimirSaldoDaConta();
		}
		
		Faturamento faturamento = new Faturamento();
		faturamento.emitirBoleto(new ContaCorrente(), new Cliente("Felipe"));
	}
}
