package br.edu.ifrn.diatinf.cubo.entities;

public class Rotacionar {
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}
}
