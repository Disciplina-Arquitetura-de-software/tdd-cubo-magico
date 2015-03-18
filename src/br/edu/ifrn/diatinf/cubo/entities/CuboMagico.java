package br.edu.ifrn.diatinf.cubo.entities;

import br.edu.ifrn.diatinf.cubo.entities.rotacionar.RotacionarComando;

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

	public void rotacionar(Direcoes direcao) {
		RotacionarComando rotacionar = RotacionarComando.getRotacionarComando(direcao);		
		rotacionar.executar(this);
	}
	
}