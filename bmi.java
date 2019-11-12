import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hi what is your name? ");
        String name = scanner.next();
        System.out.println("hi " + name + " lets calculate your BMI!");
        System.out.print("Weight(KG): ");
        double weight = scanner.nextDouble();
        System.out.print("Height(M): ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi <= 30 && bmi >= 25) {
            System.out.println("your bmi is " + bmi + ", you are overweight");
        } else if (bmi < 25 && bmi >= 18.5) {
            System.out.println("your bmi is " + bmi + ", you are normal");
        } else if (bmi < 18.5 ) {
            System.out.println("your bmi is " + bmi + ", you are underweight");
        }




    }
}
