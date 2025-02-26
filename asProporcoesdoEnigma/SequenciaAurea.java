package asProporcoesdoEnigma;
public class SequenciaAurea{
    public static String gerarString(int n){
        String valores = ""; //estamos iniciando uma string sem nada, que serve p armazenar os valores   
            for(int i = 0; i <= n; i++){ //loop de 0 ate o valor n 
            if(i > 0) // se o i for maior que o valor 0, adiciona uma , antes do numero
                valores += ",";
                valores+=i; // comeca a concatenar
    }
         return valores;
    }

    



    public static void main(String[] args) { //metodo principal onde o programa inicia
    int n = 10;
    System.out.println(gerarString(n));
    }
}
//Dentro do metodo temos um contador de valores iniciando vazio, ele passa por uma verificacao de repeticao
//onde comeca com um valor i em 0 e ele vai repetir o n ate ser maior e igual a i, ai acrecescenta.
//passa entao pela verificacao*