/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estagioribeirao;

import java.util.Arrays;

/**
 *
 * @author letci
 */
public class Questao3 {
    
    public void resolveA () {
        
        // qual o numero na posicao 5
        
        int a = 1;
        int[] vetor = new int[5];
        
        for(int i=0; i<5; i++ ) {
            
            vetor[i] = a;
            a+=2;
        }
        System.out.println("A. Sequencia completa: " + Arrays.toString(vetor));
    }
    
    public void resolveB() {
        
        // qual o numero na posicao 7
        
        int a = 2;
        int[] vetor = new int[7];
        
        for(int i=0; i<7; i++ ) {
            
            vetor[i] = a;
            a+=2;
        }
        System.out.println("B. Sequencia completa: " + Arrays.toString(vetor));
    }
    
    public void resolveC() {
        
        // qual o numero na posicao 8
        
        int a = 0;
        int[] vetor = new int[8];
        
        for(int i=0; i<8; i++ ) {
            
            vetor[i] = a;
            a= (i+1)*(i+1) ;
        }
        System.out.println("C. Sequencia completa: " + Arrays.toString(vetor));
    }
    
    public void resolveD() {
        
        // qual o numero na posicao 5
        
        int a;
        int j;
        int[] vetor = new int[5];
        
        for(int i=0; i<5; i++ ) {
            
            j= (i+1)*(i+1);
            a= 4 * j ;
            vetor[i] = a;
            
        }
        System.out.println("D. Sequencia completa: " + Arrays.toString(vetor));
    }
    
    public void resolveE() {
        
        // qual o numero na posicao 7
        
        int c = 1;
        int a=0;
        int b=1;
        int[] vetor = new int[7];
        
        for(int i=0; i<7; i++ ) {
            
            vetor[i] = c;
            c= a + b ;
            a=b;
            b=c;
        }
        System.out.println("E. Sequencia completa: " + Arrays.toString(vetor));
    }
    
   
    
}
