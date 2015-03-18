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

	StateRotacionar rotacionarEsquerda();
	StateRotacionar rotacionarDireita();
	StateRotacionar rotacionarCima();
	StateRotacionar rotacionarBaixo();
		
	}
	
}