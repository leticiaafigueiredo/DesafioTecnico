
package com.mycompany.estagioribeirao;

/**
 *
 * @author leticiaafigueiredo
 */
public class EstagioRibeirao {

    public static void main(String[] args) {
        System.out.println("Questao 1: ");
        Questao1 q1 = new Questao1();
        q1.imprimeSoma();
        
        System.out.println("\n\nQuestao 2: ");
        Questao2 q2 = new Questao2();
        q2.recebeNumero();
        
        System.out.println("\n\nQuestao3: ");
        Questao3 q3 = new Questao3();
        q3.resolveA();
        q3.resolveB();
        q3.resolveC();
        q3.resolveD();
        q3.resolveE();
        
        System.out.println("\n\nQuestao 4:\nConsidere os 3 interruptores como A, B e C.\nEu acionaria o interruptor A e B, iria ate a sala e gravaria as lamapada acessas. \nNa proxima tentativa eu acionaria o interruptor A e C e ao voltar a sala saberia que a que permaneceu acessa é do interruptor A, \na que se apagou é do interruptor B e a última seria do interruptor C.");
        
        System.out.println("\n\nQuestao 5:");
        Questao5 q5 = new Questao5();
        q5.reverteString();
    }
}
