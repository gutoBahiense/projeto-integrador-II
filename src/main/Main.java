/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

/**
 *
 * @author luiz
 */

public class Main {
    
    public static void main(String[] args){
        // iniciando Scanner
        Scanner entrada = new Scanner (System.in);
        
        //input da quantidade de alunos
        int Q;
        System.out.print("Digite a quantidade de alunos: ");
        Q = entrada.nextInt();
        //resetando o nextLine
        String nextLine = entrada.nextLine();
 
        //declarando vetor dos nomes dos alunos
        String alunos[] = new String [Q];
        //String alunos[] = {"maria", "joao", "patricia"};
        
       int i=0; 
       while (i< alunos.length){
            System.out.print("Nome do aluno " + (i+1) + ": ");
            String nome1 = entrada.nextLine();
            alunos[i] = nome1;
            i++;
        }
       
       /* System.out.println("primeiro aluno: "+alunos[0]);
        for (String nome:alunos){
        System.out.println(nome);
        }
       */
       
       // iniciando os vetores de notas
        int trimestre1[] = new int [Q];
        int trimestre2[] = new int [Q];
        int trimestre3[] = new int [Q];
        int notaFinalN[] = new int [Q];
        String stat[] = new String [Q];
        
        //loop para inserir notas
        for (int c=0; c< alunos.length; c++) {
            while (true){
                System.out.print("Digite a nota do 1º trimestre para " + alunos[c] + ": ");
                int nota1 = entrada.nextInt();
                if (nota1 >=0 && nota1 <= 30){
                    trimestre1[c] = nota1;           
                    break;
                }
                else{
                    System.out.println("Nota inválida. A nota máxima é 30");
                    continue;
                }
            }
            while (true){
                System.out.print("Digite a nota do 2º trimestre para " + alunos[c] + ": ");
                int nota2 = entrada.nextInt();
                if (nota2 >=0 && nota2 <= 30){
                    trimestre2[c] = nota2;
                    break;
                }
                else{
                    System.out.println("Nota inválida. A nota máxima é 30");
                    continue;
                }
            
            }
            while (true){
                System.out.print("Digite a nota do 3º trimestre para " + alunos[c] + ": ");
                int nota3 = entrada.nextInt();
                if (nota3 >=0 && nota3 <= 40){
                    trimestre3[c] = nota3;
                    break;
                }
                else{
                    System.out.println("Nota inválida. A nota máxima é 40");
                    continue;
                }
            
            }
        }
       
       // loop para calcular finais e situação
       String S;
       for (int b=0; b< alunos.length; b++){
           notaFinalN[b]= trimestre1[b]+trimestre2[b]+trimestre3[b];
           if (notaFinalN[b]<50){
               S = "REPROVADO";
               stat[b]= S;
           }
           else if (notaFinalN[b]<60){
               S ="PROVA FINAL";  
               stat[b]= S;
           }
           else {
               S="APROVADO";
               stat[b]= S;
           }
       }
       
       // loop para imprimir o resultado
       for (int z=0; z< alunos.length; z++){
           System.out.println(alunos[z] + " está em situação " + stat[z] + " com a nota final " + notaFinalN[z]);
       }
       
    }
}
