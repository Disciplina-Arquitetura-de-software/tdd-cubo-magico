package br.edu.ifrn.diatinf.cubo.entities;

public class BuilderCuboMagico3x3 {
	public CuboMagico cubo;
	
	public CuboMagico build() {
		cubo = new CuboMagico();
		return cubo;
	}

	public Peca buildPeca() {
		return new Peca();
	}

	public PecaFace buildPecaFace(Cor cor) {
		return new PecaFace();
	}
	
}
