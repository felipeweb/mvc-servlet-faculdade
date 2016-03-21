package br.com.fiap.servlet;

import br.com.fiap.servlet.Aluno;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Sala {

	public static double calculaMediaSala(List<Aluno> alunos) {
		double somaNotas = 0D;
		for (Aluno aluno : alunos) {
			somaNotas += aluno.getMediaFinal();
		}
		return somaNotas / alunos.size();
	}
	
	public static Aluno piorDaSala(List<Aluno> alunos) {
		Optional<Aluno> pior = alunos.stream().sorted(Comparator.comparing(Aluno::getMediaFinal)).findFirst();
		return pior.get();
	}
	
	public static Aluno melhorDaSala(List<Aluno> alunos) {
		Optional<Aluno> melhor = alunos.stream().sorted(Comparator.comparing(Aluno::getMediaFinal).reversed()).findFirst();
		return melhor.get();
	}
}
