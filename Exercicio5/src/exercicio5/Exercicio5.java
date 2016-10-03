
package exercicio5;


public class Exercicio5 {

   
    public static int propriedadeDo153(int n) {
        int i ,j, k;
        if(n >= 0 && n <= 9999){
            i = n / 100;
            j = (n - 100)/ 10;
            k = n % 10;
         if( n != ((i*i*i) + (j*j*j) + (k*k*k))){
            System.out.println("Este numero não tem a propriedade.");
         }
        }
        return n;
    }
    
}
