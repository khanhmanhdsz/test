package j1.s.p0060.model;

public class BillModel {

    private int[] bills;
    private int wallet;

    public BillModel() {
    }

    public BillModel(int[] bills, int wallet) {
        this.bills = bills;
        this.wallet = wallet;
    }

    public int[] getBills() {
        return bills;
    }

    public void setBills(int[] bills) {
        this.bills = bills;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void inputBills() {
        System.out.println("======= Shopping program ==========");
        System.out.print("Input number of bill: ");

        int size = InputValidationModel.checkInputInt();
        bills = new int[size];

        for (int i = 0; i < bills.length; i++) {
            System.out.print("Input value of bill " + (i + 1) + ": ");
            bills[i] = InputValidationModel.checkInputInt();
        }
    }

    public void inputWallet() {
        System.out.print("Input value of wallet: ");
        wallet = InputValidationModel.checkInputInt();
    }

    public int calcTotal() {
        int total = 0;

        for (int bill : bills) {
            total += bill;
        }

        return total;
    }

    public boolean payMoney() {
        return calcTotal() <= wallet;
    }

    public void printTotalAndResult() {
        int total = calcTotal();
        System.out.println("\nThis is total of bill: " + total);

        if (payMoney()) {
            System.out.println("You can buy it.");
        } else {
            System.out.println("You can't buy it.");
        }
    }
}