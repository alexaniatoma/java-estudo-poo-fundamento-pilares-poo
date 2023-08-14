package escritorio;

import empresa.equipamentos.copiadora.Copiadora;
import empresa.equipamentos.digitalizadora.Digitalizadora;
import empresa.equipamentos.impressora.Deskjet;
import empresa.equipamentos.impressora.Impressora;
import empresa.equipamentos.multifuncional.Multifuncional;

public class EscritorioMain {
	public static void main(String[] args) {
		
		Deskjet deskjet = new Deskjet();
		deskjet.imprimir();
		
		
		Multifuncional multifuncional = new Multifuncional();
		Impressora impressora = multifuncional;
		Digitalizadora digitalizadora = multifuncional;
		Copiadora copiadora = multifuncional;
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
	
	}

}
