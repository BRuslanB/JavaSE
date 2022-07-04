import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max=a; int min=a;
        if (b>max) {
            max=b;
        }
        if (c>max) {
            max=c;
        }
        if (b<min) {
            min=b;
        }
        if (c<min) {
            min=c;
        }
            System.out.println(max-min);
    }
}