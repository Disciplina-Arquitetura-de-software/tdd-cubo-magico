package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarDireita implements IState {

	
	@Override
	public Face rotacionarCubo(Direcoes dir) {
		Face facep3=facep3.getFaceEsquerda();
		return facep3;
	}

}
