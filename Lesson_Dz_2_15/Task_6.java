import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a>=1 && a<=12 && b>=1 && b<=2022) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}