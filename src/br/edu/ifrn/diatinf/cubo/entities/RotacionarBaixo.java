
package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarBaixo implements RotacionarState
{
	@Override
	public void rotacionar(Direcoes direcao){
		facePrincipal = facePrincipal.getFaceBaixo();
		
	}
}