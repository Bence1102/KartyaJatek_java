
package main;

import static main.KartyaJatek.pakli;


public class Pakli {
    private Lap[] lapok;
    
    
    private void Pakli(){
        lapok = new Lap[22];
        feltolt();
    }
    
    private void feltolt(){
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
    
    private void Kirak(){
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-7s".formatted(pakli[i]));
            if (i % 3 == 0) {
                System.out.println("\n");
            }
        
        }
    }
    
    private void kever(int oszlop){
        String[] oszlop1 = new String[7];
        String[] oszlop2 = new String[7];
        String[] oszlop3 = new String[7];

        int index = 1;

   
        for (int i = 0; i < 7; i++) {
            oszlop1[i] = pakli[index++];
            oszlop2[i] = pakli[index++];
            oszlop3[i] = pakli[index++];
        }

    

    index = 1;

    switch (oszlop) {
        case 1:
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop2[i]; //[20-(i-1)*3]
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop1[i]; //[19-(i-1)*3]
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop3[i]; //[21-(i-1)*3]
        break;
        
        case 2:
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop1[i]; //[19-(i-1)*3]
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop2[i]; //[20-(i-1)*3]
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop3[i]; //[21-(i-1)*3]
        break;
        
        case 3:
           
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop1[i]; //[19-(i-1)*3]
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop3[i]; //[21-(i-1)*3]
            for (int i = 0; i < 7; i++) pakli[index++] = oszlop2[i]; //[20-(i-1)*3]
            break;

        
        }
    }
    
    private void ezVolt(){
        
    } 
    
}
