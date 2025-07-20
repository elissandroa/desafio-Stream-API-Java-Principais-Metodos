package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio2 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 2 - Imprima a soma dos números pares da lista:");
		Double valorTotal = numeros.stream().filter(n -> n % 2 == 0).reduce(0, (a, b) -> a + b).doubleValue();
		System.out.println("Soma dos números pares: " + String.format("%.0f", valorTotal));
	}

}
