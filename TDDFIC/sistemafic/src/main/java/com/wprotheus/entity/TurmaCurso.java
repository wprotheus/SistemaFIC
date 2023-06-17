package com.wprotheus.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TurmaCurso
{
	private String local;
	private int vagas;
	private int vagasDisponiveis;
	private Date inicioAulas;
	private Date fimAulas;
	private Date inicioMatriculas;
	private Date fimMatriculas;
	private List<Estudante> estudantesMatriculados;

	public TurmaCurso(String local, int vagas, Date inicioAulas, Date fimAulas, Date inicioMatriculas, Date fimMatriculas)
	{
		this.local = local;
		this.vagas = vagas;
		this.vagasDisponiveis = vagas;
		this.inicioAulas = inicioAulas;
		this.fimAulas = fimAulas;
		this.inicioMatriculas = inicioMatriculas;
		this.fimMatriculas = fimMatriculas;
		this.estudantesMatriculados = new ArrayList<>();
	}

	public int getVagasDisponiveis()
	{
		return vagasDisponiveis;
	}

	private void setVagasDisponiveis()
	{
		this.vagasDisponiveis = 44;
	}

	public void matricularEstudante(Estudante estudante)
	{
		if (vagasDisponiveis > 0)
		{
			estudantesMatriculados.add(estudante);
			vagasDisponiveis--;
		} else
		{
			System.out.println("Não há vagas disponíveis para matrícula.");
		}
	}

	public List<Estudante> getEstudantesMatriculados()
	{
		return estudantesMatriculados;
	}
}