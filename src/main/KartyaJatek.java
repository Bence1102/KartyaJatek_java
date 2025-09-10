
package main;


public class KartyaJatek {
    static String[] pakli = new String[22];
    static String[] ertekek = new String[6];
    static String[] szinek = new String[4];
    
    public static void main(String[] args) {
        
        Osszeallit();
        Kirak();
         
         
         
        
    }
    private static void Osszeallit(){
        int index = 1;
        
        String[] szinek = {"P","T","Z","M"};
        String[] ertekek = {"Ász","Kir","Fel","X","IX","VIII"};
        
        
        for (int i = 0; i < szinek.length; i++) {
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
    
}
