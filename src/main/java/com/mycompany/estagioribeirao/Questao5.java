/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estagioribeirao;

/**
 *
 * @author letci
 */
public class Questao5 {
    
    public void reverteString() {
        
        String palavra = "TARGET";
        int j= palavra.length();
        char[] palavraInv = new char[palavra.length()];
        char c;
        String novaString = "";
        
        for(int i=0; i<palavra.length(); i++) {
 
            palavraInv[i] = palavra.charAt(j-1);
            c = palavraInv[i];
            novaString += c;
            j--;
        }
        
        System.out.println("String Invertida: " + novaString);
    }
}
