import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int sum=0; int m=0; int k=-1;
        do{
            m = in.nextInt();
            sum = sum + m;
            k++;
        }while (m!=0);
        System.out.println(sum/k);
    }
}