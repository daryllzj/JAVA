import java.util.Scanner;

public class Fizzbuzz {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
//        Gets the number from input
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0){
            System.out.println("Fizzbuzz");
        }
        else if (number % 5 == 0) {
            System.out.println("Fizz");
        }
        else if (number % 3 == 0) {
            System.out.println("Buzz");
        }
        else {
        System.out.println(number);}
    }
}
