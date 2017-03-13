/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprimeVetorAleatorioOrdenado;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Pedro Moreira
 */
public class ImprimeVetorAleatorioOrdenado {
    public static void main(String[] args){
        //Ordenação
        //Faça um programa que ordene crescentemente um vetor de 10 posições com
        //números aleatórios de 0 a 99
        Random aleatorio = new Random();
        
        int v[] = new int[10];
        int aux;
    
        //sortear os vetores
        for(int i = 0; i< v.length; i++){
            v[i] = aleatorio.nextInt(100);
        }
        
        //Imprime vetor desordenado
        System.out.println("Vetor Desordenado: " + Arrays.toString(v));
        
        //Ordenação
        for(int i = 0; i<10; i++){ 
            for(int j = i+1; j<9; j++){   
                if(v[i]>v[j]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        
        //Imprime vetor ordenado
        System.out.println("Vetor Ordenado: " + Arrays.toString(v));
    }
}
