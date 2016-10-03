
package exercicio6;

public class Exercicio6 {

    public static boolean numeroPrimo(int n) {
    int i = 2;
    
    if(n > 1){
        while(i <= (n - 1)){
            if(n % i == 0){
                return false;
            }
        }
    }
    return true;
    }
    
}
