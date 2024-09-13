import java.util.Scanner;;

class Example5 {

    private double balance;
    private double interestRate;

    public Example5(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * (interestRate / 100);
        balance += interest;
    }

    public void printBalance() {
        System.out.println("The new balance after adding interest is: $" + balance);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double initialBalance, interestRate;
        System.out.print("Enter Balance: ");
        initialBalance = scan.nextDouble();
        System.out.println();

        System.out.print("Enter Interest: ");
        interestRate = scan.nextDouble();
        System.out.println();

        Example5 account = new Example5(initialBalance, interestRate);

        account.addInterest();
        account.printBalance();

        scan.close();
    }
}
