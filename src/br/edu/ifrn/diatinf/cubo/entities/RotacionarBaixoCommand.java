package br.edu.ifrn.diatinf.cubo.entities;

public class RotacionarBaixoCommand implements Command {
	CuboMagico cuboMagico;
	
	public RotacionarBaixoCommand(CuboMagico cuboMagico) {
		this.cuboMagico = cuboMagico;
	}
	
	public void execute() {
		cuboMagico.rotacionarBaixo();
	}
}
