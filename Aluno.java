 package com.mycompany.aula10;

   //Classe Abstrata
    public class Aluno {
        
        
        //atributos
        String pnome;
        String unome;
        int pontos;
        
        //Construtor padrão
        public Aluno(){
            this("","",0);
        }
        
        //Construtor com parametros
        public Aluno(String pnomealuno, String unomealuno, int pontosaluno){
        
            pnome = pnomealuno;
            unome = unomealuno;
            pontos = pontosaluno;
        }
    }