package com.github.wesleywrl.construcao;

public class Exercicio2 {

    public static int numerosInteiros(int a, int b) {
        int totalParcelas = 0;
        int parcela = 0;

        if (0 <= a && 0 <= b) {
            totalParcelas = a;
            parcela = b;
        }
        
        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }
        
        int i = 1, s = 0;
        while (i <= totalParcelas) {
            s = s + parcela;
            i = i + 1;
        }
        
        return s;
    }

}
