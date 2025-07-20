package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio14 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 14 - Encontre o maior número primo da lista:");
		Integer maiorPrimo = numeros.stream()
				.filter(DesafioStreamAPI::isPrime)
				.max(Integer::compareTo)
				.orElse(null);
		System.out.println(maiorPrimo != null ? "O maior número primo é: " + maiorPrimo: "Não há números primos na lista");	

	}

}
