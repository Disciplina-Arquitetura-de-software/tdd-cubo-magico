package br.edu.ifrn.diatinf.cubo.entities;

public enum Cor {
	indefinida(-1), 
	vermelho(0), 
	verde(1), 
	azul(2), 
	branco(3), 
	amarelo(4),
	laranja(5);
	
	int value;
	Cor(int value){
		this.value = value;
	}
	public int getCor(){
		return value;
	}
}
