package Dio.desafio.dominio;


public class Curso extends Conteudo{
	    
    //atributos
    int cargaHoraria;
    
    public double calcularXp() {
        return XP_PADRÃO * cargaHoraria;
    }
    
    public Curso() {	
    }

    public int getCargaHoraria(){
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso > Título: " + getTitulo() + ", Descrição: " + getDescrição() + "," + " Carga Horaria: " + cargaHoraria + " | ";
    }


}
