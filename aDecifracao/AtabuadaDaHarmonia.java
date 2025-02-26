package aDecifracao;

import java.util.Scanner;

public class AtabuadaDaHarmonia{
    public static void main(String[] args) {
        Scanner  entrada = new Scanner(System.in);

        System.out.print("Digite um numero e saiba a tabuada dele");
    
        int numero = entrada.nextInt();
    
        entrada.close();

       ///
        for(int i = 1; i <=10 ; i++){
            System.out.println(numero + "x" + i + "="+ (numero * i));
        }
    }
}