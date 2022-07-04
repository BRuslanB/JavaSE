import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>=1 && a<=5) {
            a = a + 10;
        }else if (a>=10 && a<=20) {
            a = a - 5;
        }else if (a<0 || a>1000) {
            a = a * 3;
        }else{
            a=0;
        }
        System.out.println(a);
    }
}