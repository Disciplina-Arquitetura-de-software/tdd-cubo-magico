package br.edu.ifrn.diatinf.cubo.entities;

public class CuboMagico {

	public Face[] faces;
	public Face facePrincipal;
	
	public Face getFacePrincipal() {
		return this.facePrincipal;
	}
	
	public void setFacePrincipal(Face face) {
		facePrincipal = face;
	}

	public Face[] getFaces() {
		return faces;
	}

	public void setFaces(Face[] faces) {
		this.faces = faces;
	}

	public void rotacionar(Direcoes direcao) {
		
		Rotacionador rotacionador = new Rotacionador(this, direcao);
		rotacionador.rotacionar();
		
	}
	
}