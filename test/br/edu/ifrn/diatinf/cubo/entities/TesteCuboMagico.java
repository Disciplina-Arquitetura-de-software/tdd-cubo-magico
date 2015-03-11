package br.edu.ifrn.diatinf.cubo.entities;

import static org.junit.Assert.*;
import org.junit.Test;

public class TesteCuboMagico {
	
	@Test
	public void rotacionarCubo() {
		BuilderCuboMagico3x3 builder = new BuilderCuboMagico3x3();
		CuboMagico cubo = builder.buildCubo();
		
		cubo.rotacionar(Direcoes.Esquerda);
		assertEquals(Cor.vermelho, cubo.getFacePrincipal().nome);

		cubo.rotacionar(Direcoes.Esquerda);
		assertEquals(Cor.amarelo, cubo.getFacePrincipal().nome);
		
		cubo.rotacionar(Direcoes.Esquerda);
		assertEquals(Cor.laranja, cubo.getFacePrincipal().nome);

		cubo.rotacionar(Direcoes.Esquerda);
		assertEquals(Cor.branco, cubo.getFacePrincipal().nome);


		cubo.rotacionar(Direcoes.Direita);
		assertEquals(Cor.laranja, cubo.getFacePrincipal().nome);

		cubo.rotacionar(Direcoes.Direita);
		assertEquals(Cor.amarelo, cubo.getFacePrincipal().nome);

		cubo.rotacionar(Direcoes.Direita);
		assertEquals(Cor.vermelho, cubo.getFacePrincipal().nome);

		cubo.rotacionar(Direcoes.Direita);
		assertEquals(Cor.branco, cubo.getFacePrincipal().nome);
	}
}
