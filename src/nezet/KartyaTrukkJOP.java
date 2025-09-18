
package nezet;

import java.util.Scanner;
import modell.Pakli;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class KartyaTrukkJOP {
    private static Scanner sc = new Scanner(System.in);
    private static final String SEP = System.lineSeparator();
    private Pakli pakli;
    
    public KartyaTrukkJOP(){
            pakli = new Pakli();
            indito();
    }
  
     private void indito() {
        for (int i = 0; i < 3; i++) { 
           String s = pakli.Kirak(); 
           felugrobaIr(s+SEP+oszlopok()+SEP);
           int oszlop = beker(); 
           pakli.kever(oszlop);  
    }

    
        felugrobaIr("\nEz volt a lapod: ");
        felugrobaIr(pakli.ezVolt().getLeiras());
        felugrobaIr(SEP);
        
        
         
    }
     
     private static int beker() {
        boolean jo;
        int oszlop;
        
        do {
            System.out.println("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;
        
    }
     
    private String oszlopok() {
        String o = "";
        for (int i = 1; i <= 3; i++) {
            o += String.format("%-7s", i + ".");
        }
        return o + SEP;       
    } 
    
    private void felugrobaIr(String msg){
        JTextArea textArea=new JTextArea(msg);
        textArea.setFont(new java.awt.Font("Monospaced",java.awt.Font.PLAIN,12));
        textArea.setEditable(false);
        textArea.setBackground(null);
        textArea.setBorder(null);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JOptionPane.showMessageDialog(null, scrollPane, "Üzenet", JOptionPane.INFORMATION_MESSAGE);
    }
}
