package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio11 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 11 - Encontre a soma dos quadrados de todos os números da lista:");
		Integer somaQuadrados = numeros.stream().map(n -> n * n).reduce(0, Integer::sum);
		System.out.println("Soma dos quadrados: " + somaQuadrados);

	}

}
