import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a>10 && b>10 && c>10 && a%5==0 && b%5==0 && c%5==0) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}