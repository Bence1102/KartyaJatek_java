
package modell;




public class Pakli {
    private Lap[] lapok;
    
    
    public void Pakli(){
        lapok = new Lap[22];
        feltolt();
    }
    
    private void feltolt(){
    int index = 1;
        
        String[] szinek = {"P","T","Z","M"};
        String[] ertekek = {"Ász","Kir","Fel","X","IX","VIII"};
        
        
        for (int i = 0; i < szinek.length-1; i++) {
             for (int j = 0; j < ertekek.length; j++) {
                 lapok[index++] = new Lap(szinek[i] + "_" + ertekek[j]);
                 
             }
        }
        for (int i = 0; i < 3; i++) {
             lapok[index++] = new Lap(szinek[3] + "_" + ertekek[i]);
        }
    }
    
    public void Kirak(){
        for (int i = 1; i < lapok.length; i++) {
            System.out.printf("%-7s".formatted(lapok[i].toString()));
            if (i % 3 == 0) {
                System.out.println("\n");
            }
        
        }
    }
    
    public void kever(int oszlop){
        Lap[] oszlop1 = new Lap[7];
        Lap[] oszlop2 = new Lap[7];
        Lap[] oszlop3 = new Lap[7];

        int index = 1;

   
        for (int i = 0; i < 7; i++) {
            oszlop1[i] = lapok[index++];
            oszlop2[i] = lapok[index++];
            oszlop3[i] = lapok[index++];
        }

    

    index = 1;

    switch (oszlop) {
        case 1:
            for (int i = 0; i < 7; i++) lapok[index++] = oszlop2[i]; //[20-(i-1)*3]
            for (int i = 0; i < 7; i++) lapok[index++] = oszlop1[i]; //[19-(i-1)*3]
            for (int i = 0; i < 7; i++) lapok[index++] = oszlop3[i]; //[21-(i-1)*3]
        break;
        
        case 2:
            for (int i = 0; i < 7; i++) lapok[index++] = oszlop1[i]; //[19-(i-1)*3]
            for (int i = 0; i < 7; i++) lapok[index++] = oszlop2[i]; //[20-(i-1)*3]
            for (int i = 0; i < 7; i++) lapok[index++] = oszlop3[i]; //[21-(i-1)*3]
        break;
        
        case 3:
           
            for (int i = 0; i < 7; i++) lapok[index++] = oszlop1[i]; //[19-(i-1)*3]
            for (int i = 0; i < 7; i++) lapok[index++] = oszlop3[i]; //[21-(i-1)*3]
            for (int i = 0; i < 7; i++) lapok[index++] = oszlop2[i]; //[20-(i-1)*3]
            break;

        
        }
    }
    
    public String ezVolt(){
        return lapok[11].toString();
    } 
    
}
