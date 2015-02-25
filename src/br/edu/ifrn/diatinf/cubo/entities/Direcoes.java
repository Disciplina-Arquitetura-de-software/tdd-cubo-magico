package br.edu.ifrn.diatinf.cubo.entities;

public enum Direcoes {
	Cima(0),
	Direita(1),
	Baixo(2),
	Esquerda(3);
	int value;
	Direcoes(int value){
		this.value = value;
	}
	
	public int getDirecoes(){
		return value;
	}
}
