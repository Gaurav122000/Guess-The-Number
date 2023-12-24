import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // this picks a random number
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;
        int total = 0;

        do{
            System.out.println("Guess my number(1-100) : ");
            userNumber = sc.nextInt();
            total=total+1;
            if(userNumber == myNumber){
                System.out.println("Your Guess is Correct .. Correct Number");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("your number is too large");
            }
            else{
                System.out.println("your number is too small");
            }

        }while(userNumber >= 0);
        System.out.println("My number was = "+myNumber);
        System.out.println("Your total guess is = "+total);
        sc.close();
    }
}