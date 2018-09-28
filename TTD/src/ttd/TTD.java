/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ttd;

import java.util.Scanner;

/**
 *
 * @author Rosevalt
 */
public class TTD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int operation = 0;
        do {
            operation = input.nextInt();
            if (operation == 5) {
                break;
            }
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            int result = 0;
            switch(operation) {
                case 1 : result = add(n1, n2);
                case 2 : result = subs(n1, n2);
                case 3 : result = mult(n1, n2);
                case 4 : result = special(n1, n2);
            }
            System.out.println(result);
        } while (operation != 5);
        input.close();
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }
    public static int subs(int n1, int n2) {
        return n1 - n2;
    }
    public static int mult(int n1, int n2) {
        return n1 * n2;
    }
    public static int special(int n1, int n2) {
        return mult(add(n1, n2), subs(n1, n2));
    }
}
