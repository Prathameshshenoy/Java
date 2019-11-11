import java.util.Scanner;
public class demo {
    public static void main(String[] args) {
       Scanner SI = new Scanner(System.in);
        System.out.print("principal");
        int p= SI.nextInt();
        System.out.print("rate");
        int r= SI.nextInt();
        System.out.print("time");
        int t = SI.nextInt();
        int si=(t*p*r)/100;
        System.out.println("simple intrest = " + si + "$");

}
}

