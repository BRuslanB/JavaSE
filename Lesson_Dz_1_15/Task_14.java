import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        float y = 3*(x*x)-6*x-7;
        System.out.println(y);
    }
}