package br.edu.ifrn.diatinf.cubo.entities;

public class Rotacao {

	private IState state;
	
	public Rotacao() {
		this.state = state;
	}
	
	public IState getState(){
		return state;
	}
	
	public void setState(IState st) {
		this.state = st;
	}
	
	public Face rotacionarDirecao(Direcoes dir){
		Face fc = state.rotacionarCubo(dir);
		return fc;
	}
	
	
}
