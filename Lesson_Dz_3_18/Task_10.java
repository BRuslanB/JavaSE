import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0; int k=0;
        for (int i=1;i<=n;i++) {
            k=k+3;
            sum = sum + k;
        }
        System.out.println(sum);
    }
}