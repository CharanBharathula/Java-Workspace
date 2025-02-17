package BackendCourse.Assignments.BankManagement;

public class Main {
    public static void main(String[] args) {

        BankAccount obj = new BankAccount(100, "Charan");
        obj.deposit(1000);
        obj.deposit(100);
        obj.withdraw(1000);
        obj.deposit(1500);
        obj.deposit(100000);
        obj.withdraw(10000);
        obj.deposit(200);
        obj.withdraw(1000);

        System.out.println("Balance: " + obj.getBalance());
        obj.printTransactionHistory();
    }
}
