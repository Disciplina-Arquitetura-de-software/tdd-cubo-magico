package br.edu.ifrn.diatinf.cubo.entities;

public class Face {

	public PecaFace[] pecasFaces;
	public Cor nome;
	public Face[] faces = new Face[4];

	public PecaFace getPecaFace(int indice) {
		return this.pecasFaces[indice];
	}
	
	public PecaFace getPecaFace(int coluna, int linha) {
		return null;
	}
    
	public Face getFaceDireita() {
		int fc = Integer.parseInt(Direcoes.Direita.toString());
		return faces[fc];
	}

	public Face getFaceEsquerda() {
		return null;
	}

	public Face getFaceBaixo() {
		return null;
	}

	public Face getFaceCima() {
		return null;
	}
}
