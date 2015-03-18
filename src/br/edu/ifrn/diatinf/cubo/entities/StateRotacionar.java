package br.edu.ifrn.diatinf.cubo.entities;

public interface StateRotacionar {

	StateRotacionar rotacionarEsquerda(Face facePrincipal){
		facePrincipal=facePrincipal.getFaceDireita();
	};
	StateRotacionar rotacionarDireita(){
		facePrincipal=facePrincipal.getFaceEsquerda(Face facePrincipal);
	};
	StateRotacionar rotacionarCima(Face facePrincipal){
		facePrincipal=facePrincipal.getFaceCima();
	};
	StateRotacionar rotacionarBaixo(){
		facePrincipal=facePrincipal.getFaceBaix(Face facePrincipal);
	};
}

