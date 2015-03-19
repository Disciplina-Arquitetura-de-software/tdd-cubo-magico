package br.edu.ifrn.diatinf.cubo.entities;

public class RotacaoCima extends IRotacao
{
	public void executar(Cubo cubo)
	{
		Face facePrincipal = cubo.getFacePrincipal();
		cubo.setFacePrincipal(facePrincipal.getFaceBaixo());
		facePrincipal = cubo.getFacePrincipal();
		
		Face faceHorario = facePrincipal.getFaceDireita();
		Face faceAntiHorario = facePrincipal.getFaceEsquerda();
		
		faceHorario.rotacaoHoraria();
		faceAntiHorario.rotacaoAntiHoraria();
	}
}