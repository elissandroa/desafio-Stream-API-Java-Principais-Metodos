package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio17 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 17 - Filtrar os números primos da lista:");
		List<Integer> primos = numeros.stream()
				.distinct()
				.filter(DesafioStreamAPI::isPrime)
				.toList();
		System.out.println("Números primos: " + primos);

	}

}
