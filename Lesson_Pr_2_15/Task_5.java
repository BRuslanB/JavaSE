/*
Напишите программу, где ввожу целое число n, и если оно четное, программа выведет EVEN иначе ODD.
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int max = a; //System.out.println("a="+a+ " max="+ max);
        if (b>max) {
            max=b; //System.out.println("b="+b+ " max="+ max);
        }
        if (c>max){
            max=c; //System.out.println("c="+c+ " max="+ max);
        }
        if (d>max){
            max=d; //System.out.println("d="+d+ " max="+ max);
        }
        if (max%2 == 0) {
            System.out.println(max);
        }else{
            System.out.println("Not Found");
        }
    }
}
