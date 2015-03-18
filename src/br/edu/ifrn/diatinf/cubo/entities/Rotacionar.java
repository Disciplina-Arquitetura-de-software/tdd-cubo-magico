package br.edu.ifrn.diatinf.cubo.entities;

public interface StateDirecoes implements StateRotacionar{
	
	StateRotacionar rotacionarEsquerda(Face facePrincipal);
	StateRotacionar rotacionarDireita(Face facePrincipal);
	StateRotacionar rotacionarCima(Face facePrincipal);
	StateRotacionar rotacionarBaixo(Face facePrincipal);
}
