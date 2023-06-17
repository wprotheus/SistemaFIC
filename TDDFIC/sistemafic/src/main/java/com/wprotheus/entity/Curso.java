package com.wprotheus.entity;

public class Curso
{
	private String nome;
	private String cargaHoraria;
	private String descricao;
	private TurmaCurso turmaCurso;

	public Curso(String nome, String cargaHoraria, String descricao)
	{
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
	}

	public void setTurmaCurso(TurmaCurso turmaCurso)
	{
		this.turmaCurso = turmaCurso;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCargaHoraria()
	{
		return cargaHoraria;
	}

	public void setCargaHoraria(String cargaHoraria)
	{
		this.cargaHoraria = cargaHoraria;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
	}

	public TurmaCurso getTurmaCurso()
	{
		return turmaCurso;
	}
}