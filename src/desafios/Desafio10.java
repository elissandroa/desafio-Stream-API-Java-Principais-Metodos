package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio10 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:");
		List<Integer> imparesMultiplos3ou5 = numeros.stream().filter(n -> n % 2 != 0 && (n % 3 == 0 || n % 5 == 0))
				.toList();
		System.out.println("Números ímpares múltiplos de 3 ou 5: " + imparesMultiplos3ou5);

	}

}
