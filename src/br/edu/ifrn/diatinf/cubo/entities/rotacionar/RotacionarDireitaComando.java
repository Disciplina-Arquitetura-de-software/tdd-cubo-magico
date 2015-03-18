package br.edu.ifrn.diatinf.cubo.entities.rotacionar;

import br.edu.ifrn.diatinf.cubo.entities.CuboMagico;

public class RotacionarDireitaComando extends RotacionarComando {

	@Override
	public void executar(CuboMagico cubo) {
		cubo.facePrincipal = cubo.facePrincipal.getFaceEsquerda();
	}

}
