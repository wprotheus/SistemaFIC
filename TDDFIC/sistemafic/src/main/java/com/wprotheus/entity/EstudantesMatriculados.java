package com.wprotheus.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EstudantesMatriculados
{
	private List<Estudante> matriculados;
	private Date dataMatricula;

	public EstudantesMatriculados()
	{
		matriculados = new ArrayList<>();
	}

	public List<Estudante> getMatriculados()
	{
		return matriculados;
	}

	public void estudantesMatriculados(String matricula, Date dataMatricula)
	{
		Estudante estudante = new Estudante(matricula, dataMatricula);
		matriculados.add(estudante);
	}

	private boolean podeMatricular(Date dataMatricula)
	{
		return dataMatricula.before(dataMatricula) || dataMatricula.equals(dataMatricula);
	}

	public void setMatriculados(List<Estudante> matriculados)
	{
		this.matriculados = matriculados;
	}

	public Date getDataMatricula()
	{
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula)
	{
		this.dataMatricula = dataMatricula;
	}
}