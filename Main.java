package com.Calvin;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main( String[] args ) throws Exception
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();

        int p1c1 = 1+ r.nextInt(10);
        int p1c2 = 1+ r.nextInt(10);
        int p1total = p1c1 + p1c2;

        int dc1 = 1+ r.nextInt(10);
        int dc2 = 1+ r.nextInt(10);
        int dtotal = dc1 + dc2;

        String hitOrStay;
        boolean inputValStay;
        boolean inputValHit;

        System.out.println("Welcome to Calvin's blackjack program!");
        Thread.sleep(1000);

        System.out.println("You get a "+ p1c1 +" and a "+ p1c2 +".");
        System.out.println("Your total is "+ p1total +".\n");
        Thread.sleep(1000);

        System.out.println("The dealer has a "+ dc1 +" showing and a hidden card.");
        System.out.println("His total is hidden, too.\n");
        Thread.sleep(1000);

        System.out.print("Would you like to \"hit\" or \"stay\"?");
        hitOrStay = keyboard.next();
        inputValStay = hitOrStay.equals("stay");
        inputValHit = hitOrStay.equals("hit");

        Thread.sleep(1000);


        while ( inputValStay == false && inputValHit == false )
        {

            System.out.print("\nJust say \"hit\" or \"stay\". You said \""+ hitOrStay+"\"...");
            hitOrStay = keyboard.next();
            System.out.print(hitOrStay);
            Thread.sleep(1000);

            inputValStay = hitOrStay.equals("stay");
            inputValHit = hitOrStay.equals("hit");

        }


        while ( inputValHit == true )
        {

            int p1cnext = 1+ r.nextInt(10);
            p1total = p1total + p1cnext;

            if(p1total <= 21)
            {
                System.out.print("\nYou drew a "+ p1cnext +".");
                System.out.print("\nYou're total is "+ p1total +".");
            }
            else
            {
                System.out.print("\nYou drew a "+ p1cnext +".");
                System.out.print("\nYou're total is "+ p1total +", you died.");
                System.exit(0);
            }

            System.out.print("\nWould you like to \"hit\" or \"stay\"?");
            hitOrStay = keyboard.next();
            Thread.sleep(1000);

            inputValStay = hitOrStay.equals("stay");
            inputValHit = hitOrStay.equals("hit");

            while ( inputValStay == false && inputValHit == false )
            {
                System.out.print("\nJust say \"hit\" or \"stay\". You said \""+ hitOrStay+"\"...");
                hitOrStay = keyboard.next();
                System.out.print(hitOrStay);

                inputValStay = hitOrStay.equals("stay");
                inputValHit = hitOrStay.equals("hit");
            }


        }

        System.out.println("\nOkay, dealer's turn.");
        Thread.sleep(3000);

        System.out.println("His hidden card was a "+ dc2 +".");
        Thread.sleep(1000);

        System.out.println("His total is "+ dtotal +".");
        Thread.sleep(1000);

        while(dtotal <= 16){
            int dcnext = 1+ r.nextInt(10);
            dtotal = dcnext + dtotal;

            System.out.println("\nDealer chooses to hit.");
            Thread.sleep(3000);
            System.out.println("He draws a "+ dcnext +".");
            System.out.println("His total is "+ dtotal +".");
            Thread.sleep(1000);
        }
        if(dtotal <= 21){
            System.out.println("\nDealer stays.");

            System.out.println("\nDealer total is "+ dtotal +".");
            System.out.println("Youre total is "+ p1total +".");

            if(dtotal >= p1total)
            {
                System.out.println("\nYou lost!.");
            } else
            {
                System.out.println("\nYOU WIN!!!.");
            }
        } else
        {
            System.out.println("\nDEALER DIES, YOU WIN!!!.");
        }
    }


}
