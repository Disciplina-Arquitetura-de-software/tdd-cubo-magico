package br.edu.ifrn.diatinf.cubo.entities.rotacionar;

import java.util.HashMap;
import java.util.Map;

import br.edu.ifrn.diatinf.cubo.entities.CuboMagico;
import br.edu.ifrn.diatinf.cubo.entities.Direcoes;

public abstract class RotacionarComando {

	public void execute(CuboMagico cubo) {
		rotate(cubo);
		facesUpadate(cubo);
	}
	
	protected abstract void rotate(CuboMagico cubo);
	protected abstract void facesUpadate(CuboMagico cubo); 
	
	public abstract void executar(CuboMagico cubo);
	
	private static Map<Direcoes, RotacionarComando> comandos;
	
	static {
		comandos = new HashMap<Direcoes, RotacionarComando>();
		comandos.put(Direcoes.Direita, new RotacionarDireitaComando());
		comandos.put(Direcoes.Esquerda, new RotacionarEsquerdaComando());
		comandos.put(Direcoes.Cima, new RotacionarCimaComando());
		comandos.put(Direcoes.Baixo, new RotacionarBaixoComando());
	}
	
	static public RotacionarComando getRotacionarComando(Direcoes direcao) {
		return comandos.get(direcao);
	}
	
}
