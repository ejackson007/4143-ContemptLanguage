import java.util.Random;
import java.util.Scanner;

public class highLow{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        //create random value between [0 - 99]
        int n = rand.nextInt(100);
        n += 1; // n ~ [1-100];
        int guess, count = 1;
        System.out.println("I am thinking of a number between 1-100. Try to guess the number.");
        
        guess = input.nextInt();
        
        while(guess != n){
            if(guess < n){
                System.out.println("Higher");
                count++;
            }
            else{
                System.out.println("Lower");
                count++;
            }
            guess = input.nextInt();
        }
        System.out.printf("You guessed the number in %d tries\n", count);
    }
}