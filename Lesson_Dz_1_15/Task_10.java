import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        x = 2*x;
        y = y/3;
        z = z*z;
        System.out.println(x+y+z);
    }
}