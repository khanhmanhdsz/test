/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0060;

import j1.s.p0060.model.BillModel;
import j1.s.p0060.model.InputValidationModel;
import j1.s.p0060.model.SumModel;

public class Main {

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = InputValidationModel.checkInputInt();

            if (choice == 1) {
                runShoppingProgram();
            } else if (choice == 3) {
                new SumModel().run();
            } else if (choice == 2) {
                System.out.println("Exit program.");
                break;
            } else {
                System.out.println("Please choose 1, 2 or 3.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n======= MENU =======");
        System.out.println("1. Run program");
        System.out.println("2. Exit program");
        System.out.println("3. Sum two numbers");
        System.out.print("Please choose: ");
    }

    private static void runShoppingProgram() {
        BillModel billModel = new BillModel();
        billModel.inputBills();
        billModel.inputWallet();
        billModel.printTotalAndResult();
    }
}
