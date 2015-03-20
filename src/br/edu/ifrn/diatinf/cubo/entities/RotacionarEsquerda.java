package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarEsquerda implements IState {
	
	@Override
	public Face rotacionarCubo(Direcoes dir) {
		Face faceP4=faceP4.getFaceDireita();
		return faceP4;
	}

}
