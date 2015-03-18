package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarDireitaCommand implements Command {
	CuboMagico cuboMagico;
	
	public RotacionarDireitaCommand(CuboMagico cuboMagico) {
		this.cuboMagico = cuboMagico;
	}
	
	public void execute() {
		cuboMagico.rotacionarDireita();
	}
}
