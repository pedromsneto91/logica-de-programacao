/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes5;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Pedro Moreira
 */
public class Funcoes5 {
    public static void main(String[] args) {
        int exercito;
        int x = 0;
        Scanner leia = new Scanner(System.in);
        
        while(x == 0){
        System.out.println("Digite a quantidade de soldados do seu exército:");
        exercito = leia.nextInt();
        
        exercito = vencer(exercito);
        exercito = perder(exercito);
        exercito = vencer(exercito);
        
        System.out.println("O total de pontos foi: " + exercito); }
    }  
    
    public static int vencer(int exercito){
        Random a = new Random();
        
        exercito += a.nextInt(100);
        
        return exercito;
    }
    
    public static int perder(int exercito){
        Random a = new Random();
        exercito -= a.nextInt(100);
        
        return exercito;
    }
    
}
