package br.edu.ifrn.diatinf.cubo.entities;

public interface Rotacionar implements RotacionarState{
	
	StateRotacionar rotacionarEsquerda(Face facePrincipal);
	StateRotacionar rotacionarDireita(Face facePrincipal);
	StateRotacionar rotacionarCima(Face facePrincipal);
	StateRotacionar rotacionarBaixo(Face facePrincipal);
}
