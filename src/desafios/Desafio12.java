package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio12 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 12 - Encontre o produto de todos os números da lista:");
		Integer produto = numeros.stream().reduce(1, (a, b) -> a * b);
		System.out.println("Produto de todos os números: " + produto);

	}

}
