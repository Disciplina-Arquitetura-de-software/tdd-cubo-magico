
package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarEsquerda implements RotacionarState
{
	@Override
	public void rotacionar(Direcoes direcao){
		facePrincipal = facePrincipal.getFaceEsquerda();
		
	}
}