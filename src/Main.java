import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

//      set up scanner
        Scanner scanner = new Scanner(System.in);
//        Gets the principal amount from input
        System.out.print("Principal ($1k - $1M): ");
        int principal = scanner.nextInt();
        while (principal < 1000 || principal > 1000000 ){
            System.out.print("Enter a number between $1,000 and $1,000,000 \n" );
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
        }

//        Gets the Annual Interest Rate from input
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        while (annualInterest <= 0 || annualInterest > 30){
            System.out.print("Enter a number between 0 and 30 \n" );
            System.out.print("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
        }
        float monthlyRate = annualInterest/ MONTHS_IN_YEAR / PERCENT;

//      Gets the Period (Years) from input
        System.out.print("Period (Years): ");
        int years = scanner.nextInt();
        while (years <= 1 || annualInterest > 30){
            System.out.print("Enter a number between 1 and 30 \n" );
            System.out.print("Period (Years): ");
            years = scanner.nextInt();
        }
        int periods = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * ((monthlyRate * Math.pow((1 + monthlyRate) , periods)) /
                ((Math.pow((1 + monthlyRate) , periods)) - 1));

        String mortgageCurrency = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageCurrency);
    }
}
