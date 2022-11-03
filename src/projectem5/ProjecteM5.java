package projectem5;

import java.util.Scanner;

public class ProjecteM5 {


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        
        System.out.println("Introdueix en €:");
        int valor_euros = sc.nextInt();
                
        double tipus_de_canvi = 0.87d;
        System.out.println(valor_euros + " euros (€) actualment equivalen a " + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
        
        
        
        
    }
    
}
