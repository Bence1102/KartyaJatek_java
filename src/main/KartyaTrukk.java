
package main;

import java.util.Scanner;



public class KartyaTrukk {
    static Scanner sc = new Scanner(System.in);
    
     private static void indito() {
       
         
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
     
     private static int MelyikVolt(int oszlop){
         
        return 0;
         
     }
}
