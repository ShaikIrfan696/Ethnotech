//current bill question
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units: ");
        int units = sc.nextInt();

        int bill = 0;

        if(units <= 250) {
            bill = 0;
        }
        else if(units <= 300) {
            bill = 50;
        }
        else {
            bill = units * 5;
        }

        System.out.println("Electricity Bill = Rs." + bill);
    }
}