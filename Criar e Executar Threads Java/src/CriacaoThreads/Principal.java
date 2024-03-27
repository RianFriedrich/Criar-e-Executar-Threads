/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CriacaoThreads;

import java.util.Random;

public class Principal extends Thread {

    public int[] vetor = new int[5];
    public int variavel;
    Random gerador = new Random();

    public Runnable t1 = new Runnable() {
        public void run() {
            for (int variavel = 0; variavel <= 5; variavel++) {
                vetor[variavel] = gerador.nextInt(10);
                System.out.println("Numero " + vetor[variavel] + "adicionado na posicao " + variavel + "do vetor\n");
            }
        }
    };
    public Runnable t2 = new Runnable() {
        public void run() {
            for (int variavel = 0; variavel <= 5; variavel++) {
                vetor[variavel] = 0;
                System.out.println("Posicao "+ variavel + "do vetor removida\n");
            }
        }
    };

    public void main(String args[]) {
        while (true) {
            new Thread(t1).start();
            new Thread(t2).start();
        }

    }

}
