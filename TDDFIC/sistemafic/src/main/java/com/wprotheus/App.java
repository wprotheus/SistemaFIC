package com.wprotheus;

import com.wprotheus.entity.*;

import java.util.Date;
import java.util.List;

public class App
{
	public static void main(String[] args)
	{
		Estudante estudante = new Estudante("Fulano", "123456", new Date(), "Rua A, 123", "fulano@example.com");
		Celular celular = new Celular("123456789");
		estudante.setCelular(celular);
		Curso curso = new Curso("Curso de Programação", "40 horas", "Aprenda a programar");
		TurmaCurso turma = new TurmaCurso("Sala 101", 30, new Date(), new Date(), new Date(), new Date());
		curso.setTurmaCurso(turma);
		turma.matricularEstudante(estudante);
		List<Estudante> estudantesMatriculados = turma.getEstudantesMatriculados();
		for (Estudante e : estudantesMatriculados)
		{
			System.out.println(e.getNome());
		}
	}
}