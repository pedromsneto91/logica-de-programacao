/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes4;
import java.util.Scanner;
/**
 *
 * @author Pedro Moreira
 */
public class Funcoes4 {
    public static void main(String[]args){
        double saldo;
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite seu saldo para ser creditado:");
        saldo = leia.nextDouble();
        
        saldo = creditar(saldo);
        
        System.out.println("Novo saldo: " + saldo);
    }
        
        public static double creditar(double saldo){
            saldo = saldo+100;
            return saldo;
        }
        
}
