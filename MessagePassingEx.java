import java.util.Scanner;

class canarabank {
    void add(int amount) {
        int initialBalance = 50000 + amount;
        System.out.println(initialBalance);
        System.out.println("-------------------");
    }

    void withdraw() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your amount");
        int amt = scan.nextInt();
        int balance = 50000 - amt; // try initialBalance
        System.out.println("your balance is :\t" + balance);
        scan.close();
    }
}

public class MessagePassingEx {
    public static void main(String[] args) {
        canarabank solo = new canarabank();
        solo.add(2000);
        solo.withdraw();
    }
}
