package estado.brasileiro;

public class SistemaIbge {
	public static void main(String[] args) {
		for(EstadoBrasileiroEnum e : EstadoBrasileiroEnum.values()) {
			System.out.println(e.getSigla() + "-" + e.getNome() + "-" + e.getCodIbge());
		}
		
		EstadoBrasileiroEnum estadoBrasileiro = EstadoBrasileiroEnum.SAO_PAULO;
			System.out.println(estadoBrasileiro.getNome());
			System.out.println(estadoBrasileiro.getSigla());
			System.out.println(estadoBrasileiro.getNomeMaiusculo());
			System.out.println(estadoBrasileiro.getCodIbge());
	}

}
