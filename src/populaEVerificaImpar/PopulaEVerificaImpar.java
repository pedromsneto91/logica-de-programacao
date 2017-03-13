/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package populaEVerificaImpar;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Pedro Moreira
 */
public class PopulaEVerificaImpar {
    public static void main(String[] args){
        Random aleatorio = new Random();
        int v[] = new int[10];
        int impar = 0;//flag
        
        //popula vetor com números aleatórios entre 0 e 99
        for(int i=0; i<v.length; i++){
            v[i] = aleatorio.nextInt(99);
        }
        
        //imprime o vetor populado
        System.out.println(Arrays.toString(v));
        
        //checa se a posição i do vetor é ímpar
        for(int i=0; i<v.length && impar<11; i++){
            if((v[i]%2) !=0){
                impar +=1;
            }
        }
        System.out.println("Quantidade de valores ímpares: " + impar);
    }
}
