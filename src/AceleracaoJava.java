import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AceleracaoJava {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		List<Conta> list = new ArrayList<>();
		list.add(new Conta(1, "Marcelo", 10));
		list.add(new Conta(2, "Gustavo", 20));
		list.add(new Conta(3, "Fernanda", 0));
		list.add(new Conta(4, "Rosangela", 50));
		list.add(new Conta(5, "Rubens", 30));
		
		// collections handling //
		
		List<String> listaPorNomeDoCliente = list.stream()
				.sorted(Comparator.comparing(Conta::getNomeDoCliente))
				.map(Conta::getNomeDoCliente)
				.collect(Collectors.toList());
		
		 System.out.println("Listados em ordem alfabética:");
		 System.out.println(listaPorNomeDoCliente); 
		 System.out.println("*------------------*");
		//[Fernanda, Gustavo, Marcelo, Rosangela, Rubens]
		
		
		int somaDosScores = list.stream()
				.map(Conta::getScore)
				.reduce(0, (acc, curr) -> acc + curr);
		
		 System.out.println("Soma do Score das contas:");
		 System.out.println(somaDosScores);
		// 110
				
		


	}
}
