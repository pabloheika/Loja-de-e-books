package control;

import model.*;

public class ControlDados {
	private Dados d = new Dados();

	public ControlDados() {
		d.geraDados();
	}

	public Dados getD() {
		return d;
	}

	public void setD(Dados d) {
		this.d = d;
	}
}
