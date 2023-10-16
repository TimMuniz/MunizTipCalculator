import java.sql.SQLOutput;
import java.util.Scanner;
public class MunizTipCalculator {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the tip calculator!");
            System.out.println("You seem to be the guy paying whats your name? ");
            String name = scan.nextLine();
            System.out.println(name + " gotta remember that for later");
            System.out.print("How many people are seated? ");
            int tablenumber = scan.nextInt();
            System.out.println(tablenumber + " people? Got it.");
            double billbftip = 0;
            int orderstaken = 0;
            while (orderstaken != tablenumber) {
                System.out.println("How much is what you want?");
                billbftip = billbftip + scan.nextDouble(); //adds to the total amount
                orderstaken ++; //will eventually add up to the anmount of people at the table
            }
            System.out.println("Your bill before tip is " + billbftip + "$");
            System.out.println("How much tip percent? ");
            double tippercent = scan.nextDouble();
            double totaltip = (billbftip/100 * tippercent);
            double billaftertip = billbftip + totaltip;
            System.out.println("Tip percent: " + tippercent);
            System.out.println("The tip: " + totaltip +"$");
            System.out.println("Your bill after tip: " + billaftertip +"$");
            System.out.println("per person cost: " + (billbftip/tablenumber) +"$");
            System.out.println("per person tip: " + (totaltip/tablenumber)+"$");
            System.out.println("per person cost + tip: " + (billaftertip/tablenumber)+"$");
            System.out.println("lastly, what is your credit score?");
            int ans = scan.nextInt();
            if (ans <= 600) {
                System.out.println("Oh, your card was declined...");
            } else {
                System.out.println("Dont worry, your card wasnt declined.");
            }
        }
    }

