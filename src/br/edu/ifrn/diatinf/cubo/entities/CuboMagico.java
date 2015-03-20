package br.edu.ifrn.diatinf.cubo.entities;

public class CuboMagico {

	public Face[] faces;
	public Face facePrincipal;
	
	Rotacao rotacao;
	RotacionarCima rotCima;
	RotacionarBaixo rotBaixo;
	RotacionarDireita rotDireita;
	RotacionarEsquerda rotEsquerda;
	
	public Face getFacePrincipal() {
		return this.facePrincipal;
	}

	public Face[] getFaces() {
		return faces;
	}

	public void setFaces(Face[] faces) {
		this.faces = faces;
	}

//	public void rotacionar(Direcoes direcao) {
		
//		if (direcao==Direcoes.Esquerda){
//			facePrincipal=facePrincipal.getFaceDireita();
//		}
//		else if(direcao==Direcoes.Direita){
//			facePrincipal=facePrincipal.getFaceEsquerda();
//		}
//		else if(direcao==Direcoes.Cima){
//			facePrincipal=facePrincipal.getFaceBaixo();
//		}
//		else if(direcao==Direcoes.Baixo){
//			facePrincipal=facePrincipal.getFaceCima();
//		}
	
		
//	}
	
	public void rotacionarViaState(Direcoes dir){
		
		if (dir==Direcoes.Esquerda){
			rotacao.setState(rotEsquerda);
		}
		else if(dir==Direcoes.Direita){
			rotacao.setState(rotDireita);
		}
		else if(dir==Direcoes.Cima){
			rotacao.setState(rotCima);
		}
		else if(dir==Direcoes.Baixo){
			rotacao.setState(rotBaixo);
		}
	
	}
	
	
	
}