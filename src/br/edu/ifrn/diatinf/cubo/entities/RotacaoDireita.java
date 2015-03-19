package br.edu.ifrn.diatinf.cubo.entities;

public class RotacaoDireita extends IRotacao
{
	public void executar(Cubo cubo)
	{
		Face facePrincipal = cubo.getFacePrincipal();
		cubo.setFacePrincipal(facePrincipal.getFaceEsquerda());
		facePrincipal = cubo.getFacePrincipal();
		
		Face faceHorario = facePrincipal.getFaceCima();
		Face faceAntiHorario = facePrincipal.getFaceBaixo();
		
		faceHorario.rotacaoHoraria();
		faceAntiHorario.rotacaoAntiHoraria();
	}
}