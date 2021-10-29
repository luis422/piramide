package piramide;

import java.util.Scanner;

public class Piramide {

    public static void main(String[] args) {
        
        String p = "";
	System.out.println("Digite o número de linhas:");
	Scanner s = new Scanner(System.in);
        int num = Integer.parseInt(s.nextLine());
        for (int c =0;c<num;c++){
            p=p+"*";
            System.out.println(p);
        }
    }
    
}
