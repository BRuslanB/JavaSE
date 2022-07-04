import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int sum=0;
        for (int i=n;i<=m;i++) {
            sum = sum + i;
        }
        System.out.print(sum);
    }
}