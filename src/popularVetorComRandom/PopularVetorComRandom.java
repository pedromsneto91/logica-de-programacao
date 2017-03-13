/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popularVetorComRandom;

import java.util.Random;

/**
 *
 * @author Pedro Moreira
 */
public class PopularVetorComRandom {
    public static void main(String[] args){
        //O computador deve popular um vetor de 5 posições com números
        //aleatórios de 1 a 9. Dica: procure pela função random.
        
        int v[] = new int[5];
        Random aleatorio = new Random();
        
        for(int i = 0; i<v.length; i++){
            v[i] = aleatorio.nextInt(10) + 1;
            System.out.printf("A posição %d recebeu o valor %d\n", i, v[i]);
        }
    }
}
