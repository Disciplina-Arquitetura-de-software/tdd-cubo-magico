package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarCimaCommand implements Command {
	CuboMagico cuboMagico;
	
	public RotacionarCimaCommand(CuboMagico cuboMagico) {
		this.cuboMagico = cuboMagico;
	}
	
	public void execute() {
		cuboMagico.rotacionarCima();
	}
}
