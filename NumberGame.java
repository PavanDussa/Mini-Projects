import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int guess,i;
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("A number is chosen between 1 to 100. \n Guess the number within 5 trials.");
        int num=rand.nextInt(100);
//        System.out.println(num);
        System.out.println(" ");
        for (i=1;i<=5;i++){
            System.out.print("\nGuess the number : ");
            guess=sc.nextInt();
            if (guess==num){
                System.out.println("Gongratulations! \n You guessed the number.");
                break;
            } else if (num>guess) {
                System.out.println("The number is  greater than "+guess);

            } else if (num<guess) {
                System.out.println("The number is less than "+guess);

            }
            if (i==5){
                System.out.println("\n\t \t***** ***** Your trials is over...! ***** *****\n");
                System.out.println("The guess number is : "+num);
            }
        }


    }
}
