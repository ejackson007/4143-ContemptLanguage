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
        //if guess is equal, it is correct. Print outside because you will either
        //be right eventually or just quit
        while(guess != n){
            //compares guess to random number. Increments count
            if(guess < n){
                System.out.println("Higher");
            }
            else{
                System.out.println("Lower");
            }
            count++;
            //Update count
            guess = input.nextInt();
        }
        //n is now == to guess. Print success with attempts
        System.out.printf("You guessed the number in %d tries\n", count);
    }
}