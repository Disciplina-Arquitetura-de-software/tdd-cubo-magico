package br.edu.ifrn.diatinf.cubo.entities;

public class RotacaoEsquerda extends IRotacao
{
	public void executar(Cubo cubo)
	{
		Face facePrincipal = cubo.getFacePrincipal();
		cubo.setFacePrincipal(facePrincipal.getFaceDireita());
		facePrincipal = cubo.getFacePrincipal();
		
		Face faceHorario = facePrincipal.getFaceBaixo();
		Face faceAntiHorario = facePrincipal.getFaceCima();
		
		faceHorario.rotacaoHoraria();
		faceAntiHorario.rotacaoAntiHoraria();
	}
}