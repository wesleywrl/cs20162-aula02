
package com.github.wesleywrl.construcao;



public class Exercicio7 {

    public static int crivoErastotenes( int n){
        int a[]=0;
        int i = 2, c;
            
        
        
            while(i <= n/2){
                if(a[i] == 0){
                    c = i + i;
                    while(c <= n){
                        a[c] = 1;
                        c = c + i;
                    }
                }
                i = i + 1;
                
            }
            
        
       return 0;
    }
    
}
