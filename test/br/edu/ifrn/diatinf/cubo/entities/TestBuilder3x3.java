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
	public void testBuildPecaCentral() {
		
		Peca peca = builder.buildPecaCentral(Cor.vermelho);

		assertNotNull(peca);
		assertEquals(1, peca.faces.length);
		assertNotNull(peca.faces[0]);
		assertEquals(Cor.vermelho, peca.faces[0].cor);
		assertNotNull(peca.faces[0].peca);
		assertEquals(peca, peca.faces[0].peca);
	}
	
	@Test
	public void testBuildPecaLateral() {
		Peca peca = builder.buildPecaLateral(Cor.vermelho, Cor.azul);

		assertNotNull(peca);
		assertNotNull(peca.faces);
		assertEquals(2, peca.faces.length);
		assertEquals(Cor.vermelho, peca.faces[0].cor);
		assertEquals(Cor.azul, peca.faces[1].cor);
		assertNotNull(peca.faces[0].peca);
		assertNotNull(peca.faces[1].peca);
		assertEquals(peca, peca.faces[0].peca);
		assertEquals(peca, peca.faces[1].peca);
	}
	
	@Test
	public void testBuildPecaQuina() {
		Peca peca = builder.buildPecaQuina(Cor.vermelho, Cor.azul, Cor.verde);
		
		assertNotNull(peca);
		assertNotNull(peca.faces);
		assertEquals(3, peca.faces.length);
		assertEquals(Cor.vermelho, peca.faces[0].cor);
		assertEquals(Cor.azul, peca.faces[1].cor);
		assertEquals(Cor.verde, peca.faces[2].cor);
		assertNotNull(peca.faces[0].peca);
		assertNotNull(peca.faces[1].peca);
		assertNotNull(peca.faces[2].peca);
		assertEquals(peca, peca.faces[0].peca);
		assertEquals(peca, peca.faces[1].peca);
		assertEquals(peca, peca.faces[2].peca);
		
	}
	
	@Test
	public void testBuildPecaFace() {
		Peca peca = new Peca();
		PecaFace face = this.builder.buildPecaFace(Cor.vermelho);
		
		assertNotNull(face);
		assertEquals(Cor.vermelho, face.cor);
		
		face = this.builder.buildPecaFace(Cor.verde);
		assertEquals(Cor.verde, face.cor);

		face = this.builder.buildPecaFace(Cor.azul);
		assertEquals(Cor.azul, face.cor);
	}
	
	@Test
	public void testBuildFace(){
		
		
		Face face = this.builder.buildFace(Cor.vermelho); 
		
		assertNotNull(face);
		
		for (int i = 0; i < 9; i++) {
			assertNotNull(face.pecasFaces[i]);
			assertEquals(Cor.vermelho, face.pecasFaces[i].cor);
		}
		
		face = this.builder.buildFace(Cor.verde);
		
		for (int i = 0; i < 9; i++) {
			assertNotNull(face.pecasFaces[i]);
			assertEquals(Cor.verde, face.pecasFaces[i].cor);
		}
			
	}

}
