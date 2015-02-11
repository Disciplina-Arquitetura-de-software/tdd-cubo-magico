package br.edu.ifrn.diatinf.cubo.entities;

public enum Cor {
	indefinida(0), 
	vermelho(1), 
	verde(2), 
	azul(3), 
	branco(4), 
	amarelo(5),
	laranja(6);
	
	int value;
	Cor(int value){
		this.value = value;
	}
}
