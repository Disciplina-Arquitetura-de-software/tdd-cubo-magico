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

public void rotacionarCubo(Direcoes direcao) {
	switch(direcao)
	{
		case Direcoes.Cima:
			rotacionar(Direcoes.Cima);
			break;
		case Direcoes.Direita:
			rotacionar(Direcoes.Direita);
			break;
		case Direcoes.Baixo:
			rotacionar(Direcoes.Baixo);
			break;
		case Direcoes.Esquerda:
			rotacionar(Direcoes.Esquerda);
			break;
	
	}
	}
		
	}
	
}