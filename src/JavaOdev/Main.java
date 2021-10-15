package JavaOdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName, password;
        int select;
        int balance = 1500;
        int right = 3;



        System.out.println("Please enter your username and password to reach your account");

        while (right > 0) {
            System.out.print("Username :");
            userName = input.nextLine();
            System.out.print("Password : ");
            password = input.nextLine();

            if (userName.equals("Baris") && password.equals("12345")) {
                do {
                    System.out.println("1-Cash Deposit\n" +
                            "2-Withdrawal \n" +
                            "3-Balance inquiry\n" +
                            "4-Exit");

                    System.out.println("Please choose your operation.");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Value of money to deposit : ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Value of money to withdrawal: ");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("insufficient fund.");
                            } else {
                                balance -= price2;
                            }
                            break;
                        case 3:
                            System.out.println("Your balance is :"+balance);
                    }
                }
                while (select != 4);
                System.out.println("You exit from the system.Have a good day.");
                break;
            } else {
                right--;
                System.out.println("Your user data is wrong ");

                if (right == 0) {
                    System.out.println("Your account is blocked.");
                } else {
                    System.out.println("Number of rights remaining : " + right);
                }
            }
        }
    }
}
