
package main;

import java.util.Scanner;


public class KartyaJatek {
    static String[] pakli = new String[22];
     static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        indito();
         
         
        
    }

    private static void indito() {
        Osszeallit();
        for (int i = 0; i < 3; i++) {
        Kirak();
        beker();
        kever();
        }
       melyikvolt();
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

    private static int beker() {
        boolean jo;
        int oszlop;
        
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
        
    }
    
    
    
    private static void kever(){
        String[] oszlop1 = new String[7];
        String[] oszlop2 = new String[7];
        String[] oszlop3 = new String[7];

        int index = 1;

   
        for (int i = 0; i < 7; i++) {
            oszlop1[i] = pakli[index++];
            oszlop2[i] = pakli[index++];
            oszlop3[i] = pakli[index++];
        }

    int oszlop = beker();

    index = 1;

    switch (oszlop) {
        case 1:
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop2[i];
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop1[i];
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop3[i];
        break;
        
        case 2:
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop1[i];
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop2[i];
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop3[i];
        break;
        }  
    }
    private static void melyikvolt(){
        System.out.println("");
    }
}
