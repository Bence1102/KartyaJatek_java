
package nezet;

import java.util.Scanner;


public class KartyaTrukk {
    static Scanner sc = new Scanner(System.in);
    
    
    
    public static void main(String[] args) {
    indito();
    
}
     private static void indito() {
        modell.Pakli pakli = new modell.Pakli(); 
        pakli.Kirak(); 

    for (int i = 0; i < 3; i++) {
        int oszlop = beker(); 
        pakli.kever(oszlop); 
        pakli.Kirak(); 
    }

    
    System.out.println("\nEz volt a lapod: " + pakli.ezVolt());
         
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
}
