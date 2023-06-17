package com.wprotheus;

import com.wprotheus.entity.Celular;
import com.wprotheus.entity.Estudante;
import com.wprotheus.entity.EstudantesMatriculados;
import com.wprotheus.entity.TurmaCurso;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class SistemaFicTest
{
	Estudante estudante;
	Celular celular;
	EstudantesMatriculados estudantesMatriculados;
	TurmaCurso turma;
	TurmaCurso turma1;
	TurmaCurso turma2;

	@BeforeEach
	void setUp()
	{
		estudante = new Estudante("Zezinho", "2023101022", new Date(), "Rua C-17, 15", "zezinho@email.com");
		celular = new Celular("6399999-5566");

	}

	@Test
	@DisplayName("Teste preenchimento de campos Estudantes")
	public void testeEstudanteCampos()
	{
		estudante.setCelular(celular);

		Assert.assertNotNull(estudante.getNome());
		Assert.assertNotNull(estudante.getMatricula());
		Assert.assertNotNull(estudante.getDataNascimento());
		Assert.assertNotNull(estudante.getEndereco());
		Assert.assertNotNull(estudante.getEmailInstitucional());

	}

	@Test
	@DisplayName("Teste preenchimento de campos Curso")
	public void testeTurmaCursoCampos() {


	}

	@Test
	@DisplayName("Teste verificação idade mínima")
	public void testeIdadeMinima()
	{
		Date dataNascimento = new Date();
		boolean idadeValida = Estudante.validarIdade(dataNascimento);
		Assert.assertTrue(idadeValida);

	}
/*
	@Test
	@DisplayName("Teste para matrícula em curso com vagas")
	public void testeMatriculaVagaDisponivel()
	{
		turma.setVagas(5);
		turma.setVagasDisponiveis(3);

		estudante.setMatricula("2023101022");

		assertTrue(turma.getVagasDisponiveis(estudante));

		turma.setVagasDisponiveis(0);
		assertFalse(turma.podeMatricular(estudante));
	}

	@Test
	@DisplayName("Teste para checar período de matrícula")
	public void testePeriodoMatriculas()
	{
		turma.setInicioMatriculas(LocalDate.now().minusDays(7));
		turma.setFimMatriculas(LocalDate.now().plusDays(7));

		assertTrue(turma.podeMatricular(LocalDate.now()));

		turma.setInicioMatriculas(LocalDate.now().plusDays(1));
		turma.setFimMatriculas(LocalDate.now().plusDays(14));

		assertFalse(turma.podeMatricular(LocalDate.now()));
	}

	@Test
	@DisplayName("Teste para listar cursos com estudantes")
	public void testeListarTurmasComEstudantesMatriculados()
	{
		turma1.adicionarEstudanteMatriculado(new Estudante());
		turma1.adicionarEstudanteMatriculado(new Estudante());

		turma2.adicionarEstudanteMatriculado(new Estudante());

		assertTrue(turma1.temEstudantesMatriculados());
		assertFalse(turma2.temEstudantesMatriculados());
	}*/
}