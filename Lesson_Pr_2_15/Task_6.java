/*
Напишите программу, где я ввожу целые числа a и b, если их значения не равны, то выводить в консоль их сумму, иначе просто 0.
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a+b>c && a+c>b && b+c>a) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
