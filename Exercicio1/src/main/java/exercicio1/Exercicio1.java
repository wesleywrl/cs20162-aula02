
package exercicio1;

public class Exercicio1 {
    public static int numerosNaturais(int n){
        int s = 1, i = 2;
        if(1 <= n){
         while(i <= n){
            s = s + i;
            i = i + i;
         }
        }
        return s;
    }
}

