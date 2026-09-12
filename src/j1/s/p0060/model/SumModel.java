package j1.s.p0060.model;

public class SumModel {

    private int firstNumber;
    private int secondNumber;

    public void run() {
        inputNumbers();
        printSum();
    }

    private void inputNumbers() {
        System.out.print("Input the first number: ");
        firstNumber = InputValidationModel.checkInputInt();

        System.out.print("Input the second number: ");
        secondNumber = InputValidationModel.checkInputInt();
    }

    public int calculateSum() {
        return firstNumber + secondNumber;
    }

    private void printSum() {
        System.out.println("Sum: " + calculateSum());
    }
}