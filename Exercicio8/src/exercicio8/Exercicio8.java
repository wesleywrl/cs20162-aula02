
package exercicio8;

public class Exercicio8 {

    public static int maiorDivisor(int a, int b) {
        int m;
        if(b <= a && b > 0){
            while(b != 0){
                m = a % b;
                a = b;
                b = m;
            }
        }
       return a; 
    }
    
}
