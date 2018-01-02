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
public class SmilewithSmiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);

        System.out.println("n=");
        int n = s.nextInt();

        System.out.println("m=");
        int m = s.nextInt();

        String nouns[] = new String[n];

        String adjectives[] = new String[m];;

        for (int i = 0; i < n; i++) {
            nouns[i] = s.next();
        }

        for (int i = 0; i < m; i++) {
            adjectives[i] = s.next();
        }

        for (int x = 0; x < nouns.length; x++) {
            for (int y = 0; y < adjectives.length; y++) {

                System.out.println(nouns[x] + " as " + adjectives[y]);
            }
        }

    }

}
