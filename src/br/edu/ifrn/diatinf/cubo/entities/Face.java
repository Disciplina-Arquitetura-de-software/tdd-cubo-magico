package br.edu.ifrn.diatinf.cubo.entities;

public class Face {

	public PecaFace[] pecasFaces;
	public Cor nome;
	public Face[] facesVizinhas = new Face[4];

	public PecaFace getPecaFace(int indice) {
		return this.pecasFaces[indice];
	}
	
	public PecaFace getPecaFace(int coluna, int linha) {
		return null;
	}
    
	public Face getFaceDireita() {
		return facesVizinhas[Direcoes.Direita.getDirecoes()];
	}

	public Face getFaceEsquerda() {
		return facesVizinhas[Direcoes.Esquerda.getDirecoes()];
	}

	public Face getFaceBaixo() {
		return facesVizinhas[Direcoes.Baixo.getDirecoes()];
	}

	public Face getFaceCima() {
		return facesVizinhas[Direcoes.Cima.getDirecoes()];
	}
	
	public void setFacesVizinhas(Face direita, Face esquerda, Face cima, Face baixo){
		this.facesVizinhas[Direcoes.Direita.getDirecoes()] = direita;
		this.facesVizinhas[Direcoes.Esquerda.getDirecoes()] = esquerda;
		this.facesVizinhas[Direcoes.Cima.getDirecoes()] = cima;
		this.facesVizinhas[Direcoes.Baixo.getDirecoes()] = baixo;
	}
}
