import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        double pi = 3.14;
        double R = L/(2*pi);
        double S = pi*(R*R);
        System.out.println(R+" "+S);
    }
}