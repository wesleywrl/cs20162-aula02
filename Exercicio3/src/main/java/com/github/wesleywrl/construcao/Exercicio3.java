
package com.github.wesleywrl.construcao;


public class Exercicio3 {
   
    public static int produtoPotencia(int x, int y) {
        int potencia = 0, i;
        if(x >= 0 && y >= 0){
          potencia = 1;
          i = 1;
          while(i <= y){
              potencia = potencia * x;
              i = i + 1;
          }
        }
      return potencia;  
    }
    
}
