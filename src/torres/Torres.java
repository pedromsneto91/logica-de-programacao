/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torres;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author Pedro Moreira
 */
public class Torres {
    public static void main(String[] Args){
        //Torres
        //Existem 10 soldados em 10 torres numeradas de 0 a 9. Cada soldado
        //da rececbe uma numeração aleatória entre 0 e 99. O programa deve mover
        //os soldados da seguinte maneira: 
        //Soldado da torre 0 será trocado pelo da torre 0, soldado da torre 1
        // será trocado pelo da torre 8, e assim por diante.
        Random aleatorio = new Random();
        
        int v[] = new int[10];
        int aux;
        
        //sortear os vetores
        for(int i = 0; i< v.length; i++){
            v[i] = aleatorio.nextInt(100);
        }
        
        System.out.printf("Soldados e Valores " + Arrays.toString(v) + "\n");
        
        //inverter os soldados
        for(int i = 0; i<5; i++){ 
                aux = v[i];
                v[i] = v[9-i];
                v[9-i] = aux;
        }
        
        System.out.println("\nPosições Invertidas: " + Arrays.toString(v));
    }
}
