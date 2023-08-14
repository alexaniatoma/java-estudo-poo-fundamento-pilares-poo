package escola;

public class Escola {
	
	public static void main(String[] args) {
		
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		felipe.setSerie(3);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " +  felipe.getIdade() + " anos e esta na " + felipe.getSerie() + " serie");
		
		
		
	}
	
	
	

}
