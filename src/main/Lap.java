
package main;


public class Lap {
    private String leiras;

    
    public String[] Lap(String leiras){
        String[] pakli = new String[22];
        for (int i = 0; i < pakli.length; i++) {
            pakli[i] = leiras + " " + i;
        }
         return pakli;

    }
    
    
    public String getLeiras() {
        return leiras;
    }
    
    
    
}




