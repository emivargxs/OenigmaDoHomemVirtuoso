package aDecifracao;

public class ApotenciadaProporcao{

 public static int pontencia(int a, int b){
     return(int) Math.pow(a, b);
    }
    public static void main(String[] args) {
    int a = 2;
    int b = 3;
    System.out.println(a + "^" + b + "=" + pontencia(a, b));


    }
}