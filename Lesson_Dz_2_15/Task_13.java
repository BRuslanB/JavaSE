import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c=a;
        if (a>b) {
            System.out.println("YES");
        }else{
            a=b; b=c;
            System.out.println(a+"\n"+b);
        }
    }
}