/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningjava0.pkg5;

import java.util.Scanner;

/**
 *
 * @author 348676487
 */
public class NicholasLovesTobogganing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);

        while (true) {

            String factorsList = scan.nextLine();

            String[] factors = factorsList.split(" ");

            int topDistance = Integer.parseInt(factors[0]);
            double distance = Integer.parseInt(factors[1]);
            int slide = Integer.parseInt(factors[2]);
            double fatigue = (Integer.parseInt(factors[3])) / 100.0 * distance;

            double totalDistance = 0;

            int attemptCounter = 0;

            while (true) {

                if (distance > 0) {
                    totalDistance = totalDistance + distance;
                }
                attemptCounter++;

                if (totalDistance >= topDistance) {
                    System.out.println("SUCCESS ON ATTEMPT " + attemptCounter);
                    break;
                }

                totalDistance -= slide;

                distance = distance - fatigue;

                if (totalDistance < 0) {
                    System.out.println("FAILURE ON ATTEMPT " + attemptCounter);
                    break;
                }

            }
        }
    }
}
