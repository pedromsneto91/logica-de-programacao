/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes2;
import java.util.Scanner;
/**
 *
 * @author Pedro Moreira
 */
public class Funcoes2 {
    public static void main (String[] args){
        //código feito no dia 08/06/2016
        Scanner leia = new Scanner(System.in);
        int  x;
        
        System.out.println("Digite um numero:");
        x = leia.nextInt();
        
        x = dobro(x);
        
        System.out.println("O dobro do numero é: " + x);
    }
    
    
        public static int dobro(int x){
            x = x*2;
            
            return x;   
        }
}

