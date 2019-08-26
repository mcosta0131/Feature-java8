package com.feature.java8.lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.feature.java8.model.Curso;

public class TestsStream {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		System.out.println("Todos os cursos antes do tratamento com STREAM: ");
		cursos.forEach(n -> System.out.println(n.getNome()));

		cursos = filtraLista(cursos);

	}
	
	/* Recebe uma lista de cursos e retorna somente os que tem mais de 100 alunos */
	public static List<Curso> filtraLista(List<Curso> lista) {
		lista = lista.stream().filter(c -> c.getAlunos() > 100).collect(Collectors.toList());
		
		System.out.println("Cursos depois do tratamento com STREAM : ");
		lista.forEach(n -> {
			System.out.println(n.getNome());
		});
		return lista;
	}
}
