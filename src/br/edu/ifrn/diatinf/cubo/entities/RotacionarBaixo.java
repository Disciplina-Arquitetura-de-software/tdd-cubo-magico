package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarBaixo implements IState {

	
	@Override
	public Face rotacionarCubo(Direcoes dir) {
		Face facep=facep.getFaceCima();
		return facep;
	}

}
