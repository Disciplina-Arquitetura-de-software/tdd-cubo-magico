package br.edu.ifrn.diatinf.cubo.entities;

public class BuilderCuboMagico3x3 {
	public CuboMagico cubo;
	
	public CuboMagico build() {
		cubo = new CuboMagico();
		return cubo;
	}

	public PecaFace buildPecaFace(Cor cor) {
		PecaFace face = new PecaFace();
		face.cor = cor;
		return face;
	}

	public Peca buildPecaCentral(Cor cor) {
		Peca p = new Peca();
		p.faces[0] = this.buildPecaFace(cor);
		return p;
	}

	public Peca buildPecaLateral(Cor cor1, Cor cor2) {
		Peca p = new Peca();
		p.faces = new PecaFace[2];
		p.faces[0] = this.buildPecaFace(cor1);
		p.faces[1]=this.buildPecaFace(cor2);
		return p;
	}

	public Peca buildPecaQuina(Cor vermelho, Cor azul, Cor verde) {
		// TODO Auto-generated method stub
		Peca p = new Peca();
		p.faces = new PecaFace[3];
		p.faces[0] = this.buildPecaFace(vermelho);
		p.faces[1] = this.buildPecaFace(azul);
		p.faces[2] = this.buildPecaFace(verde);
		return p;
	}
	
}
