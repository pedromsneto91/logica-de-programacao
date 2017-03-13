/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes1;
import java.util.Scanner;
/**
 *
 * @author Pedro Moreira
 */
public class Funcoes1 {
    public static void main(String[] args){
        //código feito no dia 01/06/2016
        
        
        int a,b, soma, subtracao, multiplicacao, divisao;
        Scanner leia = new Scanner(System.in);
        System.out.println("Calculadora\nDigite os valores para 'a' e para 'b'");
        a = leia.nextInt();
        b = leia.nextInt();

        soma = somar(a,b);
        subtracao = subtrair(a,b);
        multiplicacao = multiplicar(a,b);
        divisao = dividir(a,b);
        
        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("A multiplicação é: " + multiplicacao);
        System.out.println("A divisão é: " + divisao);
        }
        //fim do método main 
        
        //funções
        public static int somar(int a, int b){
            int soma = 0;
            
            soma = a + b;
        
            return soma;
        }
    
        public static int subtrair(int x, int y){
    
            int subtracao = 0;
            
            subtracao = x - y;
        
            return subtracao;
        }
    
        public static int multiplicar(int x, int y){
    
            int multiplicacao = 0;
            
            multiplicacao = x * y;
        
            return multiplicacao;
        }
        
        public static int dividir(int x, int y){
        
            int divisao = 0;
            
            divisao = x / y;
        
            return divisao;
        }
}
