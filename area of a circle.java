import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);
        System.out.print("radius : ");
        double radius = area.nextDouble();
        double circle = 3.14159 * (radius*radius);
        System.out.println("the area of the circle is: " + circle);


    }
}
