
 
package com.github.wesleywrl.construcao;


public class Exercicio4 {

   
    public static int propriedadeDo3025(int n ) {
        int i , j ;
        if(n >= 0 && n <= 9999){
          i = n / 100;
          j = n % 100;
         
          if( n != (i + j) * (i + j)){
            System.out.println("Este numero não tem a propriedade.");
        }
        }
        return n;
    }
    
}
