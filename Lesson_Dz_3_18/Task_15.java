import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double sum=1; double d=1;
        while (d!=0){
            d = in.nextDouble(); 
            if (d==0)
                break;
            sum = sum * d;
        }
        System.out.println(sum);
    }
}