import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = a;
        if (a!=b){
            a=a+b; b=c+b;
        }else{
            a=0; b=0;
        }
        System.out.println(a+"\n"+b);
    }
}