package br.edu.ifrn.diatinf.cubo.entities;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestBuilder3x3 {

	private BuilderCuboMagico3x3 builder = new BuilderCuboMagico3x3();
	
	@Test
	public void testBuildCuboBuildNotNull() {
		CuboMagico cubo = builder.build();
		assertNotNull(cubo);
	}
	
	@Test
	public void testBuildPeca() {
		
		Peca peca = builder.buildPecaCentral(Cor.vermelho);

		assertNotNull(peca);
		assertEquals(1, peca.faces.length);
		assertNotNull(peca.faces[0]);
		assertEquals(Cor.vermelho, peca.faces[0].cor);

		peca = builder.buildPecaLateral(Cor.vermelho, Cor.azul);

		assertNotNull(peca);
		assertNotNull(peca.faces);
		assertEquals(2, peca.faces.length);
		assertEquals(Cor.vermelho, peca.faces[0].cor);
		assertEquals(Cor.azul, peca.faces[1].cor);
		
		peca = builder.buildPecaQuina(Cor.vermelho, Cor.azul, Cor.verde);
		
		assertNotNull(peca);
		assertNotNull(peca.faces);
		assertEquals(3, peca.faces.length);
		assertEquals(Cor.vermelho, peca.faces[0].cor);
		assertEquals(Cor.azul, peca.faces[1].cor);
		assertEquals(Cor.verde, peca.faces[2].cor);
		
	}
	
	@Test
	public void testBuildPecaFace() {
		PecaFace face = this.builder.buildPecaFace(Cor.vermelho);
		
		assertNotNull(face);
		assertEquals(Cor.vermelho, face.cor);
		
		face = this.builder.buildPecaFace(Cor.verde);
		assertEquals(Cor.verde, face.cor);

		face = this.builder.buildPecaFace(Cor.azul);
		assertEquals(Cor.azul, face.cor);
	}

}
