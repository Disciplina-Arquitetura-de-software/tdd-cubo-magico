package br.edu.ifrn.diatinf.cubo.entities;

public class PecaFace {

	public Cor cor = Cor.indefinida;
	public Peca peca;
	
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public Peca getPeca() {
		return peca;
	}
	public void setPeca(Peca peca) {
		this.peca = peca;
	}
}
