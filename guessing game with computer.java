import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("hi lets play a guessing game!");
        System.out.println(" the computer will think of a number from 0-20 and you have to try and guess it!");
        System.out.println("LETS PLAY, ENTER YOUR FIRST GUESS NOW!");
        int computer = (int) Math.round(Math.random() * 20);
        int i =0;
        while (i != 7) {
            i++;
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.print("guess");
            byte userinput = scanner.nextByte();
            if (userinput > computer){
                System.out.println("the number is less than " + userinput);
            }
            if(userinput < computer){
                System.out.println("the number is greater than " + userinput);
            }
            if(userinput == computer){
                System.out.println("YES!, you guessed it");
                break;
            }


        } System.out.println("the number is " + computer + "!");
    }
}

