import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int count=0;
        for (int i=n;i<=m;i++) {
          if (i%2==0){
            count++;
          }
        }
        System.out.print(count);
    }
}