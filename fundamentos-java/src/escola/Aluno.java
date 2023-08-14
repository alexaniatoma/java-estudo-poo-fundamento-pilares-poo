package escola;

public class Aluno {
	
	private String nome;
	private int idade;
	private int serie;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String newNome) {
		nome = newNome;
	}
	
	public int getIdade() {
		return idade; 
	}
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
	
	public int getSerie() {
		return serie;
	}
	
	public void setSerie(int newSerie) {
		this.serie = newSerie;
	}
	
	

}
