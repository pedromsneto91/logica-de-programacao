/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaNotaBonificada;

import java.util.Scanner;

/**
 *
 * @author Pedro Moreira
 */
public class MediaNotaBonificada {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double v[] = new double[5], media;
        media = 0;
        
        int i;
        for(i = 0; i < v.length; i++){
        
            System.out.printf("Digite a nota nº %d: ", i+1);
            v[i] = leia.nextDouble();
            if(v[i]>=0.0 && v[i]<=8.0){
                System.out.println("Nota confirmada.");
            }else {
                System.out.println("Nota não é válida. Refaça digitando uma nota entre 0 e 8");
            }
   
        }
        System.out.println("\n");
        
        for(i = 0; i<v.length; i++){
            v[i] = v[i]+2.0;
            System.out.printf("A nota %d bonificada foi: %f\n", i+1,v[i]);
            
        }
        System.out.println();
        
        for(i = 0; i<v.length; i++){
            media += v[i];
        }
       
        media = (media /v.length);
        
        System.out.println("A média foi: " + media);
    }
}
