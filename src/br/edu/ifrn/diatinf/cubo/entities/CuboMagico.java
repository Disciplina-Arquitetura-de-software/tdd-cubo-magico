package br.edu.ifrn.diatinf.cubo.entities;

public class CuboMagico {

	public Face[] faces;
	public Face facePrincipal;
	
	public Face getFacePrincipal() {
		return this.facePrincipal;
	}

	public Face[] getFaces() {
		return faces;
	}

	public void setFaces(Face[] faces) {
		this.faces = faces;
	}
	
	public void rotacionarEsquerda() {
		facePrincipal = facePrincipal.getFaceDireita();
	}
	
	public void rotacionarDireita() {
		facePrincipal = facePrincipal.getFaceEsquerda();
	}
	
	public void rotacionarBaixo() {
		facePrincipal = facePrincipal.getFaceBaixo();
	}
	public void rotacionarCima() {
		facePrincipal = facePrincipal.getFaceCima();
	}
}