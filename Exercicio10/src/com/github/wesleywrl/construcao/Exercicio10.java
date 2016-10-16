
package com.github.wesleywrl.construcao;

public class Exercicio10 {

    public static int numeroHarmonico(int n) {
       int s = 1, i = 2;
       if(n >= 1){
         while(i <= n){
             s = s + 1/i;
             i = i + 1;
         }  
       }
       return s;
    }
    
}
