import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i=0;
        int n=0;
        do {
            n = in.nextInt();
            i++;
        }while (n!=0);
        System.out.print(i-1);
        }
    }