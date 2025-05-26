package com.mycompany.aula10;

import javax.swing.JOptionPane;

public class ClasseMenu {
    public static void main(String[] args) {
        
        //Instanca da classe abstrata com 3 registros tipo vetor
        Aluno[] aluno = new Aluno[3];
        
        // Instamcia da classe métodos
        ClasseMetodos m = new ClasseMetodos();

        // Inicializa os objetos do vetor
        for (int i = 0; i < 3; i++) {
            aluno[i] = new Aluno();
        }

        int opc = 0;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Cadastrar Alunos\n" +
                "2 - Consultar Registros\n" +
                "9 - Finalizar"));

            switch (opc) {
                case 1:
                    aluno = m.FCadastra(aluno); //Chama função
                    break;
                case 2:
                    m.FConsulta(aluno); // Chama procedimento
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }
}