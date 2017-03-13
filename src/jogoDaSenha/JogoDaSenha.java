/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoDaSenha;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Pedro Moreira
 */
public class JogoDaSenha {
    public static void main(String[] args){
        //Jogo da senha
        //Faça um jogo que gere uma senha de 3 números de 1 a 9
        //O programa deve mostrar a senha toda zerada
        //|0|0|0|
        //a cada acerto na posição correta, o(s) número(s) devem ser revelados
        //|  |  |
        //10 tentativas
        
        Random aleatorio = new Random();
        Scanner leia = new Scanner(System.in);
        
        int v[] = new int[3];
        int v2[] = new int[3];
        
        System.out.println("*********Jogo da Senha*********");
        
        //coloca os valores nas posições, gerando a senha
        for(int i = 0; i<v.length; i++){
            v[i] = aleatorio.nextInt(9) + 1;
        }
        
        //zera as senhas. |0|0|0|
        for(int i=0; i<v.length; i++){
            v2[i] = 0;
        }
        
        System.out.println("\t   " + Arrays.toString(v2));//imprime o vetor zerado
        //System.out.println(Arrays.toString(v));//imprime o vetor sorteado
        
        //jogo começa
        for(int i = 1; i<=10; i++){
            System.out.printf("\nTentativa %d:\n",i);
            
            v2[0] = leia.nextInt();
            System.out.println("\t   " + Arrays.toString(v2));
            
            v2[1] = leia.nextInt();
            System.out.println("\t   " + Arrays.toString(v2));
           
            v2[2] = leia.nextInt();
            System.out.println("\t   " + Arrays.toString(v2) + "\n");
            
            //isso facilita a nova tentativa, caso a senha seja incorreta.
            if(v2[0] == v[0]){
                System.out.println("Você encontrou o primeiro dígito.");
            }
            if(v2[1] == v[1]){
                System.out.println("Você encontrou o segundo dígito.");
            }
            if(v2[2] == v[2]){
                System.out.println("Você encontrou o terceiro dígito");
            }
            
            //se, e somente se, as três senhas forem descobertas
            if(v2[0] == v[0] && v2[1] == v[1] && v2[2] == v[2]){
                System.out.printf("\nSenha correta.\nVocê conseguiu na "
                        + "tentativa %d",i);
                break;
            } else{ //senão...e o vetor auxiliar é zerado
                System.out.println("Senha incorreta.");  
                v2[0]=0;
                v2[1]=0;
                v2[2]=0;
            }
            
        }
        System.out.println("\nA senha é: " + 
                        Arrays.toString(v) + "\n\n*********GAMEOVER*********");
    }
}
