package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        

         Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un nome");
        String nome = input.nextLine();  
        
        System.out.println("Il nome che  hai appena inserito e': " + nome);


        System.out.println("Inserisci un cognome");
        String cognome = input.nextLine();  
        
        System.out.println("Il cognome che  hai appena inserito e': " + cognome);


        System.out.println("Inserisci il tuo colore preferito");
        String colorePreferito = input.nextLine();    
        
        System.out.println("Il colore che  hai appena inserito e': " + colorePreferito );

        
        








    }
    
}
