
package Exercicio2;

import java.util.Scanner;

/**
 *
 * @author a1620819
 */

//Exercicio 2 Busca Sequencial 

public class BuscaSequen {
   public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        int n = 60, achou, i, np;
        int num[] = new int [n];
        //lendo os números em ordem/ usa um algoritmo de ordenação
        for (i=0; i<n; i++) {
            System.out.println("Digite o " +(i+1)+ "° número");
            num[i] = ler.nextInt();
        }
             
        //digitando o número a ser buscado no vetor
        System.out.println("Digite o número a ser buscado:");
        np = ler.nextInt();
        
        //buscando o número digitado no vetor
        achou = 0;
        i = 0;
        while (i < n && achou == 0 && np >= num[i]){
            if (num[i] == np){
                achou = 1;
            }else
                i++;
        }
        if (achou == 0){
            System.out.println("Número não encontrado no vetor");
        }else
            System.out.println("Número encontrado na posição " +(i+1));
    }

}

    
    
    
    

