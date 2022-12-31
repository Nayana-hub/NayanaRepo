class Account {
    private int balance;

    Account() {
        balance = 5000;
    }

    void setBalance(int bal) {
        try {
            if (bal >= 5000) {
                this.balance = bal;
                System.out.println("Account is created with balance=" + bal);

            } else {
                this.balance = 0;
                System.out.println("Account can not be created");
                throw new LowBalanceException();

            }
        } catch (LowBalanceException e) {
            System.out.println(e);
        }

    }

    int getBalance() {

        return balance;
    }
}

class LowBalanceException extends Exception {
    public String toString() {
        return "The balance can not be less than 5000/-";

    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.setBalance(6565);
        ac.getBalance();
        ac.setBalance(445);
    }
}
