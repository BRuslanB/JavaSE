import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum =0;
        for (int i=1;i<=n;i++) {
            sum = sum+1.0/i;
        }
        System.out.print(sum);
    }
}