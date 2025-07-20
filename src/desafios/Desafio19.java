package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio19 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 19 - Encontre a soma dos números divisíveis por 3 e 5:");
		Integer somaDivisiveisPor3e5 = numeros.stream()
				.filter(n -> n % 3 == 0 || n % 5 == 0)
				.reduce(0, Integer::sum);	
		System.out.println("Soma dos números divisíveis por 3 ou 5: " + somaDivisiveisPor3e5);
	}

}
