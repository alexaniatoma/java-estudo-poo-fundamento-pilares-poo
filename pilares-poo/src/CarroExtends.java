
public class CarroExtends extends VeiculoAbstract{
	
	public void ligar() {
		conferirCombustivel();
		conferirCambio();
		System.out.println("Carro ligado");
	}

	private void conferirCombustivel() {
		System.out.println("Conferindo Combustivel");
	}
	
	private void conferirCambio() {
		System.out.println("Conferir cambio em P");
	}

}
