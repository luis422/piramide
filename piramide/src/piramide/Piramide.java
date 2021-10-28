package piramide;

import javax.swing.JOptionPane;

public class Piramide {

    public static void main(String[] args) {
        
        int num=0;
        String p = "";
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número de linhas:"));
        for (int c =0;c<num;c++){
            p=p+"*";
            System.out.println(p);
        }
    }
    
}
