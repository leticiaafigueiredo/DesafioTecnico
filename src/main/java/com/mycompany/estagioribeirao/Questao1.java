/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estagioribeirao;

/**
 *
 * @author letci
 */
public class Questao1 {
    //inicializando varaveis
    int indice =13;
    int soma = 0;
    int k = 0;
    
    public void imprimeSoma() {
        
        int retornoSoma = encontraSoma();
        System.out.println("Resultado da soma= " + retornoSoma);
    }
    
    public int encontraSoma() {
        
        while(k<indice) {
            k+=1;
            soma+=k;
        }
        
        return soma;
    }
    
}
