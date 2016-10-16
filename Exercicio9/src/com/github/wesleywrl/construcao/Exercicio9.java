
package com.github.wesleywrl.construcao;

public class Exercicio9 {

    public static int maiorDivisor2(int a, int b) {
        
        if(b <= a && b > 0){
            while(a != b ){
                if(a > b){
                    a = a - b;
                }
                else{
                    b = b - a;
                }
            }
        }
       return a; 
    }
    
}
