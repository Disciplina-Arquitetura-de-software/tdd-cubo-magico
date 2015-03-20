
package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarDireita implements RotacionarState
{
	@Override
	public void rotacionar(Direcoes direcao){
		facePrincipal = facePrincipal.getFaceDireita();
		
	}
}