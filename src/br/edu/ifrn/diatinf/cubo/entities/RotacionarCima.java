
package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarCima implements RotacionarState
{
	@Override
	public void rotacionar(Direcoes direcao){
	facePrincipal = facePrincipal.getFaceCima();
		
	}
}