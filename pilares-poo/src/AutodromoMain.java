
public class AutodromoMain {
	public static void main(String[] args) {
		
		CarroExtends jeep = new CarroExtends();
		jeep.setChassi("123598");
		//jeep.ligar();
		
		MotoExtends z400 = new MotoExtends();
		z400.setChassi("4569");
		z400.ligar();
		
		VeiculoAbstract coringa = jeep;
		coringa.ligar();
	}

}
