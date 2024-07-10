package Dio.desafio.dominio;

import java.time.LocalDate;

	public class Mentoria extends Conteudo {
		
	    LocalDate data;
	    
		public double calcularXp() {
			return XP_PADRÃO + 20d;
		}
	    
	    public Mentoria() {
	    	
	    }
	    
	    public LocalDate getData(){
	        return data;
	    }
	    public void setData(LocalDate data){
	        this.data = data;
	    }
	    
	    public String toString() {
	        return " Mentoria > Título: " + getTitulo() + " - Descrição: " + getDescrição() + " - Data: " + data + " | ";
	    }
	}
