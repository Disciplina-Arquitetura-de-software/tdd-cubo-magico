package br.edu.ifrn.diatinf.cubo.entities;

public class Rotacionador
{
	private Cubo cubo;
	private IRotacao rotacao;
	
	public Rotacionador(Cubo cuboMagico, Direcoes direcao)
	{
		cubo = cuboMagico;
		switch(direcao)
		{
			case Direcoes.Direita:
				rotacao = new RotacaoDireita();
				break;
			case Direcoes.Cima:
				rotacao = new RotacaoCima();
				break;
			case Direcoes.Esquerda:
				rotacao = new RotacaoEsquerda();
				break;
			case Direcoes.Baixo:
				rotacao = new RotacaoBaixo();
				break;
		}
	}
	
	public void rotacionar()
	{
		rotacao.executar();
	}
}