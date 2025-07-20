package desafios;

import java.util.List;

import desafios.util.DesafioStreamAPI;

public class Desafio9 {

	public static void main(String[] args) {
		List<Integer> numeros = DesafioStreamAPI.numeros;
		System.out.println("\nDesafio 9 - Verificar se todos os números da lista são distintos (não se repetem):");
		boolean todosDistintos = numeros.stream().distinct().count() == numeros.size();
		System.out.println(todosDistintos ? "Todos os números são distintos" : "Existem números repetidos na lista");


	}

}
