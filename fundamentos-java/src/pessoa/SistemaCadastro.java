package pessoa;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa marcos = new Pessoa("123", "Marcos");
		marcos.setEndereco("Rua da Praia");
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf()+ "-" +
		marcos.getEndereco());
		
	}
	
	
	

}
