package br.edu.ifrn.diatinf.cubo.entities.rotacionar;

import br.edu.ifrn.diatinf.cubo.entities.CuboMagico;

public class RotacionarBaixoComando extends RotacionarComando {

	@Override
	public void executar(CuboMagico cubo) {
		cubo.facePrincipal = cubo.facePrincipal.getFaceCima();
	}

	@Override
	protected void rotate(CuboMagico cubo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void facesUpadate(CuboMagico cubo) {
		// TODO Auto-generated method stub
		
	}

}
