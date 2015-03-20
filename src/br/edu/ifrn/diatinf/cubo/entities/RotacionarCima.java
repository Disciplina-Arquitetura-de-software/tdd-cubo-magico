package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarCima implements IState {

	@Override
	public Face rotacionarCubo(Direcoes dir) {
		Face facep2=facep2.getFaceBaixo();
		return facep2;

	}

}
