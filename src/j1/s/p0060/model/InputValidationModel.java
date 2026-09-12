package j1.s.p0060.model;

import java.util.Scanner;

public class InputValidationModel {

    public static final Scanner sc = new Scanner(System.in);

    public static int checkInputInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Please input a number.");
                System.out.print("Enter again: ");
            }
        }
    }
}