package br.edu.ifrn.diatinf.cubo.entities;

public class RotacaoBaixo extends IRotacao
{
	public void executar(Cubo cubo)
	{
		Face facePrincipal = cubo.getFacePrincipal();
		cubo.setFacePrincipal(facePrincipal.getFaceCima());
		facePrincipal = cubo.getFacePrincipal();
		
		Face faceHorario = facePrincipal.getFaceEsquerda();
		Face faceAntiHorario = facePrincipal.getFaceDireita();
		
		faceHorario.rotacaoHoraria();
		faceAntiHorario.rotacaoAntiHoraria();
	}
}