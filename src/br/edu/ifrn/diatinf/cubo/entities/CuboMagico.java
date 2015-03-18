package br.edu.ifrn.diatinf.cubo.entities;

public class CuboMagico {

	public Face[] faces;
	public Face facePrincipal;
	
	public Face getFacePrincipal() {
		return this.facePrincipal;
	}

	public Face[] getFaces() {
		return faces;
	}

	public void setFaces(Face[] faces) {
		this.faces = faces;
	}

	public void rotacionar(Direcoes direcao) {
		
		facePrincipal=facePrincipal.getFace(direcao.getOposto());
		Face faceHorario;		//Face a sofrer rotação no sentido horario
		Face faceAntiHorario;	//Face a sofrer rotação no sentido anti-horario
		
		if (direcao.getDirecoes()%2 == 1){//rotação horizontal
			faceAntiHorario = facePrincipal.getFaceCima();
			faceHorario = facePrincipal.getFaceBaixo();
		}
		else{//rotação vertical
			faceHorario = facePrincipal.getFaceDireita();
			faceAntiHorario = facePrincipal.getFaceEsquerda();
		}
		
		if(direcao.getDirecoes() > 1){//para a esquerda ou para baixo
			Face faceAux = faceHorario;
			faceHorario = faceAntiHorario;
			faceAntiHorario = faceAux;
		}
		
		faceHorario.rotacaoHoraria();
		faceAntiHorario.rotacaoAntiHoraria();
		
	}
	
}