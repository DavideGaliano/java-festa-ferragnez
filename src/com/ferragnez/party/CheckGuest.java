package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

    public static void main(String[] args) {
        // Lista degli invitati
        String[] guestList = {
            "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", 
            "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", 
            "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"
        };

        // Scanner per input utente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto alla festa dei Ferragnez! Per favore, inserisci il tuo nome:");

        // Leggi il nome dell'utente
        String userName = scanner.nextLine();

        // Verifica se il nome è presente nella lista
        boolean isInvited = false;
        //for (String guest : guestList) {
        //    if (guest.equalsIgnoreCase(userName)) {
        //        isInvited = true;
        //        break;
        //    }
        //}
        
        //Bonus
        int i = 0;
        while (i < guestList.length) {
            if (guestList[i].equalsIgnoreCase(userName)) {
                isInvited = true;
                break;
            }
            i++;
        }

        // Stampa il risultato
        if (isInvited) {
            System.out.println("Benvenuto/a " + userName + "! Puoi entrare alla festa.");
        } else {
            System.out.println("Mi dispiace, " + userName + ", ma non sei nella lista degli invitati.");
        }

        // Chiudere lo scanner
        scanner.close();
    }
}
