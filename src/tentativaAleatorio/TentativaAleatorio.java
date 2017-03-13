/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tentativaAleatorio;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Pedro Moreira
 */
public class TentativaAleatorio {
    public static void main(String[] args){
        //Faça um jogo que gere um número aleatório entre 0 e 100.
        //O jogador terá, no máximo, 10 tentativas
        //A cadda tentativa/chute, será mostrado na tela "CHUTOU ALGO" se o
        //número chutado for maior que o número gerado, e "CHUTOU BAIXO" caso
        //contrário.
        //Ao final de 10 tentativas, mostre "GAME OVER"
        //----------------------------------------------------------------------
        Random aleatorio = new Random();
        Scanner leia = new Scanner(System.in);
        
        int chute, gerado;
        int flag = 0;
        
        System.out.println("JOGO DOS CHUTES ALEATÓRIOS");
        System.out.println("-------------------------------------------------");
        System.out.println("Você tem 10 tentativas. Valendo!!\n");
        
        chute = aleatorio.nextInt(100) + 1;
        
        for(int i = 0; i<10; i++){
            System.out.printf("Tentativa %d\n", i+1);
            System.out.print("Chute um número de 0 a 100: ");
            gerado = leia.nextInt();

            if(gerado > chute){
                System.out.println("chute alto");
                flag +=1;
            }else if (gerado < chute){
                System.out.println("chute baixo");
                flag += 1;
            }else if (gerado == chute){
                System.out.println("ACERTOU!!!");
                break;
            }
            System.out.println();
        }
        
        System.out.println("\nO número aleatório gerado foi: " + chute);
        System.out.println("Você parou na tentativa " + (flag +1));
        System.out.println("GAME OVER");
    }
}
