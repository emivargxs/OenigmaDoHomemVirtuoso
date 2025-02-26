package aDecifracao;

import java.util.Scanner;

public class OsPrimosdaMensagem {
    public static boolean primo(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i< n; i++){
            if(n % i == 0){
            return false;
            }
        }
    return true;
}
public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

    System.out.println("Digite um primero numero");
    int numero1 = entrada.nextInt();
    
    System.out.println("Digite um segundo numero");
    int numero2 = entrada.nextInt();

    entrada.close();

    if(primo(numero1) & primo(numero2)){
        int numero3 = numero1 + numero2;
        System.out.println(numero1 + "+" + numero2 + "=" + numero3);
    } else {
        System.out.println("Nao e primo");
    }
}
}