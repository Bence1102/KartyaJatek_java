
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
        int index = 0;
        
        String[] szinek = {"P","T","Z","M"};
        String[] ertekek = {"Ász","Kir","Fel","X","IX","VIII"};
        
        
        for (int i = 0; i < szinek.length; i++) {
             for (int j = 0; j < ertekek.length; j++) {
                 pakli[index] = szinek[i] + " " + ertekek[j];
                 i++;
             }
        }
        }
    
    private static void Kirak(){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 10; i++) {
            System.out.println(pakli[i]);
        }
        }
        
    }
    
}
