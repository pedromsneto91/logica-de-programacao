/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoExercito;

/**
 *
 * @author Pedro Moreira
 */
public class JogoExercito {
    public static void main(String[] args){
        /*O meu exército é formado por 10 combatentes(numerados de 0 a 9). 
        Todos receberam 10 de XP inicialmente. Acrescene 5XP aos combatentes que
        tiverem números pares.*/
        
        int xpDoSoldado[] = new int[9];
        for(int i = 0; i<xpDoSoldado.length; i++){
            xpDoSoldado[i] +=10;
        }
        for(int i = 0; i<xpDoSoldado.length; i = i+2){
            xpDoSoldado[i] += 5;
        }
        for(int i = 0; i<xpDoSoldado.length; i++){
            System.out.printf("Soldado: %d, XP: %d\n", i, xpDoSoldado[i]);
        }
    }
}
