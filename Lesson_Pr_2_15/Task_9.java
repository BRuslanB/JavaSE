import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>20) {
            a=a/6;
        }else{
            a=a*6;
        }
        System.out.println(a);
    }
}
