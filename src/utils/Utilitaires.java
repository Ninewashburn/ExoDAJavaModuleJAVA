package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilitaires {

    public static String saisieString() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int saisieInt() {
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }
}
