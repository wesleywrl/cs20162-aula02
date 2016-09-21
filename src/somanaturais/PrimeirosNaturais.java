/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package somanaturais;

/**
 *
 * @author aluno
 */
public class PrimeirosNaturais {
    public static int numerosPrimos(int n, int i, int s){
        if(1 <= n){
            i = 2;
            s = 1;
           
        }
        while(i <= n){
            s = s + i;
            i = i + i;
        }
        return s;
    }
}
