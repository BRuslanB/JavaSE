import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a<=2019) {
            System.out.println("NO");
        }else if (a>=2021){
            System.out.println("YES");
        }else {
            System.out.println("ERROR");
        }
    }
}
