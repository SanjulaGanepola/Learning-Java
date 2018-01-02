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
public class TransistorGain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Initialize the scanner
        Scanner s = new Scanner(System.in);

        //Declare variables
        double collectorCurrent;
        double baseCurrent;
        double beta;

        //Loop the calculation
        while (true) {
            //Obtain the collector current
            System.out.println("Enter the collector current");
            collectorCurrent = s.nextDouble();

            //End the loop when the collector current is zero
            if (collectorCurrent == 0) {
                break;
            }

            //Obtain the base current
            System.out.println("Enter the base current");
            baseCurrent = s.nextDouble();

            //Calculate then output the current gain
            beta = collectorCurrent / baseCurrent;
            System.out.println("The current gain:" + beta);
        }
    }
}
