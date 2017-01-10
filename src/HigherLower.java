/**
 * Created by Dominik on 27.12.2016.
 */
import java.util.Random;
import java.util.Scanner;

public class HigherLower {
    public static void main(String[] args){

        int x = new Random().nextInt(10)+1;
        boolean win=false;
        while(!win) {
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            if (x > guess) System.out.println("You`re guess is lower. Try again");
            else if (x > guess) System.out.println("You`re guess is higher. Try again");
            else if (x == guess) {
                System.out.println("Congrats! You guessed the number!");
                win=true;}
        }

    }

}
