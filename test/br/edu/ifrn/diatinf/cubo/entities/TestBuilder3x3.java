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
		Peca peca = this.builder.buildPeca();
		
		assertNotNull(peca);
	}
	
	@Test
	public void testBuildPecaFace() {
		PecaFace face = this.builder.buildPecaFace(Cor.vermelho);
		
		assertNotNull(face);
		assertEquals(Cor.vermelho, face.cor);
		
		face = this.builder.buildPecaFace(Cor.verde);
		assertEquals(Cor.verde, face.cor);
	}

}
