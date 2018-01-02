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
public class NowIKnowMyABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.print("Input:");
            String text = s.nextLine();

            String output = "";

            if (text.equals("stop")) {
                return;
            }

            text = text.toUpperCase();

            int frequency = 0;

            char checkChar = 'A';

            char[] letter = new char[text.length()];

            for (int x = 0; x < 26; x++) {
                for (int i = 0; i < text.length(); i++) {
                    if (text.charAt(i) == checkChar) {
                        frequency++;
                    }
                }
                if (frequency > 0) {
                    output += (checkChar + "-" + frequency + ":");
                }

                checkChar++;
                frequency = 0;
            }

            output = output.substring(0, output.length() - 1);
            System.out.println(output);
        }

    }
}
