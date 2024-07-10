package Dio.desafio;

import Dio.desafio.dominio.Bootcamp;
import Dio.desafio.dominio.Conteudo;
import Dio.desafio.dominio.Curso;
import Dio.desafio.dominio.Dev;
import Dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso java");
    curso1.setDescrição("Curso java, para praticar o POO");
    curso1.setCargaHoraria(8);
    
    Curso curso2 = new Curso();
    curso2.setTitulo("Curso javaJS");
    curso2.setDescrição("Curso js, para praticar");
    curso2.setCargaHoraria(5);

    Mentoria mentoria1 = new Mentoria();
    mentoria1.setTitulo("Mentoria java");
    mentoria1.setDescrição(" - Descrição Mentoria - ");
    mentoria1.setData(LocalDate.now());
    
    Mentoria mentoriaJs = new Mentoria();
    mentoriaJs.setTitulo("Mentoria java JS");
    mentoriaJs.setDescrição(" - Descrição Mentoria JS - ");
    mentoriaJs.setData(LocalDate.now());
    
    /*System.out.println(curso1 + mentoria1.getTitulo() + mentoria1.getDescrição() + mentoria1.getData());
    System.out.println(curso2 + mentoriaJs.getTitulo() + mentoriaJs.getDescrição() + " > Data indefinida < ");*/
    
    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Curso Java Developer");
    bootcamp.setDescrição("Bootcamp java developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(mentoria1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoriaJs);
    
    Dev devRaphaella = new Dev();
    devRaphaella.setNome("Raphaella");
    devRaphaella.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos de Raphaella: " + devRaphaella.getConteudosInscritos());
    System.out.println(" - ");
    devRaphaella.progredir();
    devRaphaella.progredir();
    devRaphaella.progredir();
    devRaphaella.progredir();
    System.out.println("Conteúdos inscritos de Raphaella: " + devRaphaella.getConteudosInscritos());
    System.out.println(" - ");
    System.out.println("Conteúdos concluídos de Raphaella: " + devRaphaella.getConteudosConcluidos());
    System.out.println(" - ");
    System.out.println("Total XP: " + devRaphaella.calcularTotalXp());
    
    System.out.println("_ _ _ _ _ _ _ _ _ _ _ _");

    Dev devJoao = new Dev();
    devJoao.setNome("Joao");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos de Joao: " + devJoao.getConteudosInscritos());
    System.out.println(" - ");
    devJoao.progredir();       
    devJoao.progredir();
    System.out.println("Conteúdos inscritos de Joao: " + devJoao.getConteudosInscritos());
    System.out.println(" - ");
    System.out.println("Conteúdos concluídos de Joao: " + devJoao.getConteudosConcluidos());
    System.out.println(" - ");
    System.out.println("Total XP: " + devJoao.calcularTotalXp());

    
    }

}