package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio18 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 18 - Verifique se todos os números da lista são iguais:");
		boolean todosIguais = numeros.stream().distinct().count() == 1;
		System.out.println(todosIguais ? "Todos os números são iguais" : "Os números não são iguais");

	}

}
