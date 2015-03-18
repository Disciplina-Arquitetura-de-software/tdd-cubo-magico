package br.edu.ifrn.diatinf.cubo.entities.rotacionar;

import br.edu.ifrn.diatinf.cubo.entities.CuboMagico;

public class RotacionarBaixoComando extends RotacionarComando {

	@Override
	public void executar(CuboMagico cubo) {
		cubo.facePrincipal = cubo.facePrincipal.getFaceCima();
	}

}