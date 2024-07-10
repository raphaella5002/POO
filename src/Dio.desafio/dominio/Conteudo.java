package Dio.desafio.dominio;

public abstract class Conteudo {

	protected static final double XP_PADRÃO = 10;
	
	private String titulo;
	private String descrição;
	
	public abstract double calcularXp();
	
	//getters and setters
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}
	
	
}
