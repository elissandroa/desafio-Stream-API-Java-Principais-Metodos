package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio16 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 16 - Agrupe os números em pares e ímpares:");
		List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).toList();
		List<Integer> impares = numeros.stream().filter(n -> n % 2 != 0).toList();
		pares.forEach(System.out::print);
		System.out.println();
		impares.forEach(System.out::print);

	}

}
