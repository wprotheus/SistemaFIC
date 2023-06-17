package com.wprotheus.entity;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Estudante
{
	private String nome;
	private String matricula;
	private Date dataNascimento;
	private String endereco;
	private String emailInstitucional;
	private Celular celular;

	public Estudante(String nome, String matricula, Date dataNascimento, String endereco, String email)
	{
		this.nome = nome;
		this.matricula = matricula;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.emailInstitucional = email;
	}

	public Estudante(String matricula, Date dataMatricula)
	{
		this.matricula = matricula;
		dataMatricula = dataMatricula;
	}

	public static boolean validarIdade(Date dataNascimento)
	{
		Date anoAtual = Date.from(Instant.now());
		int anoMatricula = anoAtual.getYear();
		if(dataNascimento.compareTo(anoAtual)>=15)
			return true;
		else return false;
	}

	public void setCelular(Celular celular)
	{
		this.celular = celular;
	}

	private String gerarMatricula()
	{
		String meio;
		String matricula;
		LocalDate anoAtual = LocalDate.now();
		int anoMatricula = anoAtual.getYear();
		int mes = anoAtual.getMonthValue();
		Random random = new Random();
		int sufixoMatricula = random.nextInt(44);
		if (mes <= 5) meio = "1010";
		else meio = "2010";
		matricula = anoMatricula + meio + sufixoMatricula;
		return matricula;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getMatricula()
	{
		return matricula;
	}

	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}

	public Date getDataNascimento()
	{
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}

	public String getEndereco()
	{
		return endereco;
	}

	public void setEndereco(String endereco)
	{
		this.endereco = endereco;
	}

	public String getEmailInstitucional()
	{
		return emailInstitucional;
	}

	public void setEmailInstitucional(String emailInstitucional)
	{
		this.emailInstitucional = emailInstitucional;
	}

	public Celular getCelular()
	{
		return celular;
	}
}