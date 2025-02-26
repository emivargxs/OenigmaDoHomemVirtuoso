package asProporcoesdoEnigma;

public class OnumeroMestre {
    public static boolean primo(int n){
        if (n <=1 ){ 
            return false;
        } 
        for (int i = 2; i < n; i++) { 
            if (n % i == 0) { 
                return false;
            }

    }
    return true;
}


public static void main(String[] args) {
  int n = 22;
  if (primo(n)){
    System.out.println(n + " é primo!");
} else {
    System.out.println(n + " não é primo!");
}

}
}
