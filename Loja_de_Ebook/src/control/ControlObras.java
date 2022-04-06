package control;

import java.util.ArrayList;

import model.*;

public class ControlObras {
	private ArrayList<Obra> o;

	public ControlObras(ControlDados d) {
		this.o = d.getObras();
	}
	
	public String[] getNomeObra() {
		String[] s = new String[o.size()];
		for(int i = 0; i < o.size(); i++) {
			s[i] = o.get(i).getTitulo();
		}
		
		return s;
	}

}
