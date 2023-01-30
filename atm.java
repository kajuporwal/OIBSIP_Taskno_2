package com.company;
import java.util.*;
class onee {
    public void Transaction_History(){
        System.out.println("Transaction History");
        System.out.println("\n Transaction History is : null");
        System.out.println("Press 0 to go back");
        Scanner sc=new Scanner(System.in);
        int back = sc.nextInt();
        do {
            if (back == 0){
                return;
            }else
                System.out.println("Wrong input");
        }while (back != 0);
    }
}
class twoo {
    public int Withdraw(int amount){
        Scanner sc=new Scanner(System.in);
            System.out.println("\n Enter the amount to Withdraw : ");
            int w=sc.nextInt();

            if(w % 100 !=0)
            {
                System.out.println("\n Please enter amount in multiple of 100.");
            }

            else if(w > amount)
            {
                System.out.println("\n Insufficient balance!");
            }
            else
            {
                amount=amount-w;
                System.out.println("Your current balance is : "+amount);
            }
        System.out.println("Press 0 to go back");
        int back = sc.nextInt();
        do {
            if (back == 0){
                return amount;
            }else
                System.out.println("Wrong input");
        }while (back != 0);
    return amount;
    }
}
class three {
    public int  Deposit(int amount){
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter the amount to deposit :  ");
        int d=sc.nextInt();
        amount=amount+d;
        System.out.println("Your current balance is : "+amount);
        System.out.println("Press 0 to go back");
        int back = sc.nextInt();
        do {
            if (back == 0){
                return amount;
            }else
                System.out.println("Wrong input");
        }while (back != 0);

    return amount;
    }
}
class four{
    public int Transfer(int amount){
            System.out.println("Transaction to the account");

            Scanner sr=new Scanner(System.in);
            System.out.println("\n Enter your Name : ");
            String receipent = sr.nextLine();
            System.out.println("\n Enter amount you wish to transfer : ");
            int amount1=sr.nextInt();
            if(amount >= amount1)
                {
                    if(amount1<=10000)
                    {
                        amount -=amount1;
                        System.out.println("\n Successfully transfered to : "+receipent);
                        String str=amount1 + " : Rs transfered to : " + receipent + "\n ";
                        System.out.println("Your current balance is : "+amount);
                    }
                    else {
                        System.out.println("\n Invalid transfer ! Limit is 150000.00 only");
                    }
                }
                else{
                    System.out.println("\n Insufficient Balance !");
                }
        System.out.println("Press 0 to go back");
        Scanner sc=new Scanner(System.in);
        int back = sc.nextInt();
        do {
            if (back == 0){
                return amount;
            }else
                System.out.println("Wrong input");
        }while (back != 0);
    return amount;}
}
class five{
    public void quit() {
            System.out.println("Thank you for using ATM Service !!");
    }
}
public class atm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id = 11,pin = 22;
        int choice;
        int amount = 500;
        onee obj1 = new onee();
        twoo obj2 = new twoo();
        three obj3 = new three();
        four obj4 = new four();
        five obj5 = new five();
        do{
            System.out.println(" Please Enter your ID : ");
            id=sc.nextInt();

            System.out.println("Please Enter your Pin : ");
            pin=sc.nextInt();

            if(id!=11)
            {
                System.out.println("You entered wrong Id");
            }

            if(pin!=22)
            {
                System.out.println("You entered wrong Pin ");
            }
        }while(id!=11 || pin!=22);

        do {
            System.out.println("WELCOME TO ATM SERVICE");
            System.out.println("\n 1. Enter 1 for Transaction History.\n 2. Enter 2 for Withdraw. \n 3. Enter 3 for Deposit. \n 4. Enter 4 for Transfer. \n 5. Enter 5 for Quit. ");
            System.out.println("\n Please Enter your choice here : ");
            choice=sc.nextInt();
            switch (choice) {
                case 1 -> obj1.Transaction_History();
                case 2 -> amount = obj2.Withdraw(amount);
                case 3 -> amount = obj3.Deposit(amount);
                case 4 -> amount = obj4.Transfer(amount);
                case 5 -> obj5.quit();
            }
        }while (choice !=5);
    }
}

