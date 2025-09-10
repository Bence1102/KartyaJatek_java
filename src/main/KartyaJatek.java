
package main;

import java.util.Scanner;


public class KartyaJatek {
    static String[] pakli = new String[22];
     static Scanner scanner = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        indito();
         
         
        
    }

    private static void indito() {
        Osszeallit();
        Kirak();
        beker();
    }
    
    
    private static void Osszeallit(){
        int index = 1;
        
        String[] szinek = {"P","T","Z","M"};
        String[] ertekek = {"Ász","Kir","Fel","X","IX","VIII"};
        
        
        for (int i = 0; i < szinek.length-1; i++) {
             for (int j = 0; j < ertekek.length; j++) {
                 pakli[index++] = szinek[i] + "_" + ertekek[j];
                 
             }
        }
        for (int i = 0; i < 3; i++) {
             pakli[index++] = szinek[3] + "_" + ertekek[i];
        }
        }
    
    private static void Kirak(){
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-7s".formatted(pakli[i]));
            if (i % 3 == 0) {
                System.out.println("\n");
            }
        
        }
        
    }

    private static void beker() {
        boolean jo;
        int oszlop;
        
        do {
            System.out.print("Válassz egy kártyát a pakliból (1-től 22-ig): ");
        } while (jo);
        
        int valasztottIndex = scanner.nextInt() - 1;
    }
    
    
    
    private static void kever(){}
}
