/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacaoEDivisao;
import java.util.Scanner;
/**
 *
 * @author Pedro Moreira
 */
public class MultipEDiv {
    public static void main(String[] args) {
        //multiplicação e divisão somente usando soma ou subtração
        Scanner teclado = new Scanner(System.in);
        double a,b;
        double resultado = 0;
        
        
        System.out.println("Digite os valores para serem multiplicados:");
    
        a = teclado.nextDouble();
        b = teclado.nextDouble();
    
        for(int i=1; i<=a; i++){
            
            resultado += b;
        }
               
        System.out.println("o resultado é: " + resultado);
        
        System.out.println();
        System.out.println();
        
        //divisão utilizando apenas soma ou subtração
        double dividendo, acumulaDividendo = 0, divisor,resultado2 = 0, resto = 0;
        double quociente = 0;
        double contador = 0;
        
        System.out.println("Digite os valores para serem divididos:");
        dividendo = teclado.nextDouble();
        divisor = teclado.nextDouble();
        
        if(dividendo == divisor){
            quociente = 1;
            resto = 0;
        }
        
        if(dividendo >=divisor){
            acumulaDividendo = dividendo;
            while(dividendo>=divisor){
                quociente = dividendo - divisor;
                dividendo = quociente;
                contador ++;
            }
        quociente = contador;
        
        for(int i=1; i<=quociente; i++){
            resultado2 += divisor;
        }
        
        resto = acumulaDividendo - resultado2;
        
        }
        
        System.out.println("Dividendo: " + acumulaDividendo);
        
        System.out.println("Quociente: " + quociente);
        System.out.println("Resto: " + resto);
    }
}
