package br.edu.ifrn.diatinf.cubo.entities;

import static org.junit.Assert.*;

import java.util.HashSet;
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
			assertEquals(Cor.vermelho, face.getPecaFace(i).cor);
		}
		
		face = this.builder.buildFace(Cor.verde);
		
		for (int i = 0; i < 9; i++) {
			assertNotNull(face.getPecaFace(i));
			assertEquals(Cor.verde, face.getPecaFace(i).cor);
		}
		
		assertNotNull(face.facesVizinhas);
		assertNull(face.getFaceDireita());
		assertNull(face.getFaceEsquerda());
		assertNull(face.getFaceCima());
		assertNull(face.getFaceBaixo());
			
	}
	
	@Test
	public void testBuild6Faces(){
		
		Face[] faces = this.builder.build6faces(); 
		HashSet<Cor> cores = new HashSet<Cor>();
		
		assertNotNull(faces);
		assertEquals(6,faces.length);	
		
		for( Face face : faces ){
			assertNotNull(face);
			cores.add(face.getPecaFace(0).cor);
		}
		
		assertEquals(6, cores.size());
		
	}
	
	@Test
	public void testBuildCubo(){
		
		CuboMagico cubo = this.builder.buildCubo();
		assertNotNull(cubo);
		
		assertEquals(6, cubo.faces.length);
		
		Face branco = cubo.getFacePrincipal();
		assertEquals(Cor.branco, branco.nome);
		assertNotNull(branco.getFaceDireita());
		assertEquals(Cor.vermelho,branco.getFaceDireita().nome);
		assertNotNull(branco.getFaceEsquerda());
		assertEquals(Cor.laranja, branco.getFaceEsquerda().nome);
		assertNotNull(branco.getFaceCima());
		assertEquals(Cor.azul, branco.getFaceCima().nome);
		assertNotNull(branco.getFaceBaixo());
		assertEquals(Cor.verde, branco.getFaceBaixo().nome);
		
		Face vermelho = branco.getFaceDireita();
		assertEquals(Cor.vermelho, vermelho.nome);
		assertNotNull(vermelho.getFaceDireita());
		assertEquals(Cor.amarelo,vermelho.getFaceDireita().nome);
		assertNotNull(vermelho.getFaceEsquerda());
		assertEquals(Cor.branco, vermelho.getFaceEsquerda().nome);
		assertNotNull(vermelho.getFaceCima());
		assertEquals(Cor.azul, vermelho.getFaceCima().nome);
		assertNotNull(vermelho.getFaceBaixo());
		assertEquals(Cor.verde, vermelho.getFaceBaixo().nome);
        
        Face laranja = branco.getFaceEsquerda();
        assertEquals(Cor.laranja, laranja.nome);
        assertNotNull(laranja.getFaceDireita());
        assertEquals(Cor.amarelo,laranja.getFaceEsquerda().nome);
        assertNotNull(laranja.getFaceEsquerda());
        assertEquals(Cor.branco, laranja.getFaceDireita().nome);
        assertNotNull(laranja.getFaceCima());
        assertEquals(Cor.azul, laranja.getFaceCima().nome);
        assertNotNull(laranja.getFaceBaixo());
        assertEquals(Cor.verde, laranja.getFaceBaixo().nome);
        
		Face verde = branco.getFaceBaixo();
		assertEquals(Cor.verde, verde.nome);
		assertNotNull(verde.getFaceDireita());
		assertEquals(Cor.vermelho, verde.getFaceDireita().nome);
		assertNotNull(verde.getFaceEsquerda());
		assertEquals(Cor.laranja, verde.getFaceEsquerda().nome);
		assertNotNull(verde.getFaceCima());
		assertEquals(Cor.branco, verde.getFaceCima());
		assertNotNull(verde.getFaceBaixo());
		assertEquals(Cor.amarelo, verde.getFaceBaixo());
		
		Face amarelo = vermelho.getFaceDireita();
		assertEquals(Cor.amarelo, amarelo.nome);
		assertNotNull(amarelo.getFaceDireita());
		assertEquals(Cor.laranja,amarelo.getFaceDireita().nome);
		assertNotNull(amarelo.getFaceEsquerda());
		assertEquals(Cor.vermelho, amarelo.getFaceEsquerda().nome);
		assertNotNull(amarelo.getFaceCima());
		assertEquals(Cor.azul, amarelo.getFaceCima().nome);
		assertNotNull(amarelo.getFaceBaixo());
		assertEquals(Cor.verde, amarelo.getFaceBaixo().nome);
		
		Face azul = branco.getFaceCima();
		assertEquals(Cor.azul, azul.nome);
		assertNotNull(azul.getFaceDireita());
		assertEquals(Cor.vermelho,azul.getFaceDireita().nome);
		assertNotNull(azul.getFaceEsquerda());
		assertEquals(Cor.laranja, azul.getFaceEsquerda().nome);
		assertNotNull(azul.getFaceCima());
		assertEquals(Cor.verde, azul.getFaceCima().nome);
		assertNotNull(azul.getFaceBaixo());
		assertEquals(Cor.branco, azul.getFaceBaixo().nome);
		
	}
	
	
	
	
}
