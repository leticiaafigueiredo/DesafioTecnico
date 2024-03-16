/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estagioribeirao;

/**
 *
 * @author letci
 */

import java.util.Scanner;

public class Questao2 {
    
    boolean pertence = false;
    int a;
    int b;
    int c;
    
    public void recebeNumero() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual numero vc deseja conferir?\nR: ");
        int num = scanner.nextInt();
        pertenciaFibonacci(num);
    }
    
    public void imprimeResultado( boolean pertence, int num) {
        
        if(pertence) { 
            System.out.println("O numero " + num + " pertence a sequencia de Fibonacci!");
        } else{
            System.out.println("O numero " + num + " nao pertence a sequencia de Fibonacci!");
        }
    }
    
    public void pertenciaFibonacci(int num) {
        
        a=0;
        b=1;
        
        for(int i=0; c<=num; i++) { 
            
            c = a + b;
            
            if(num == a || num == b|| num == c) {
                pertence = true;
            }
            a=b;
            b=c;
        }
        
        imprimeResultado(pertence, num);
    }
}
