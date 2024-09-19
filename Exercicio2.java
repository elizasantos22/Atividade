/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio2;



//busca binaria

import java.util.Scanner;

/**
 *
 * @author a1620819
 */
public class Exercicio2 {
     public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n = 60, np, inicio, fim, meio, achou;
        int num[] = new int[n];
        
    
        for (int i=0; i<n; i++) {
            System.out.println("Digite o " +(i+1)+ "° número");
            num[i] = ler.nextInt();
        }
    
     System.out.println("Digite o número a ser buscado:");
        np = ler.nextInt();
        
        achou = 0;
        inicio = 0;
        fim = n-1;
        meio = (inicio+fim)/2;
        while (inicio <= fim && achou == 0){
            if (num[meio] == np){
               achou = 1; 
            }else {
                if (np < num[meio]){
                    fim = meio - 1;
                }else
                    inicio = meio+1;
                    meio = (inicio+fim)/2;
            }
        }
        if (achou == 0){
            System.out.println("Número não encontrado no vetor");
        }else
            System.out.println("Número encontrado na "+(meio+1)+ "° posição ");
    }
}
    
    
