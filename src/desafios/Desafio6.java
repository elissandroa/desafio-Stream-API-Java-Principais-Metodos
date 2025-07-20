package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio6 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 6 - Verificar se a lista contém algum número maior que 10:");
		boolean existeMaiorQue10 = numeros.stream().anyMatch(n -> n > 10);
		System.out.println(existeMaiorQue10 ? "A lista contém números maiores que 10"
				: "A lista não contém números maiores que 10");

	}

}
