package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarEsquerdaCommand implements Command {
	CuboMagico cuboMagico;
	
	public RotacionarEsquerdaCommand(CuboMagico cuboMagico) {
		this.cuboMagico = cuboMagico;
	}
	
	public void execute() {
		cuboMagico.rotacionarEsquerda();
	}
}
