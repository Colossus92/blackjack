package com.Calvin;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        int tries = 0;
        int maxTries = 4;

        System.out.println("WELCOME TO THE BANK OF CALVIN.");
        System.out.print("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        tries++;

        while ( entry != pin && tries < maxTries )
        {
            int triesLeft = maxTries - tries;
            String warning = ((triesLeft == 1) ? triesLeft + " TRY LEFT!" : triesLeft + " TRIES LEFT!");
            System.out.println("\nINCORRECT PIN. TRY AGAIN. YOU HAVE " + warning);
            System.out.print("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
            tries++;
        }

        if ( entry == pin )
            System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        else if ( tries >= maxTries )
            System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
    }
}
