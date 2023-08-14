package estado.brasileiro;

public enum EstadoBrasileiroEnum {
	SAO_PAULO ("SP", "São Paulo", 11),
	RIO_jANEIRO("RJ", "Rio de Janeiro", 12),
	PIAUI("PI", "Piaui", 13),
	MARANHAO("MA", "Maranhão", 14),
	CEARA("CE", "Ceara", 15);
	
	private String nome;
	private String sigla;
	private int codIbge;
	
	private EstadoBrasileiroEnum(String sigla, String nome, int codIbge) {
		this.sigla = sigla;
		this.nome = nome;
		this.codIbge = codIbge;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
	public int getCodIbge() {
		return codIbge;
	}

}
