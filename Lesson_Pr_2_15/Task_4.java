/*
Напишите программу, где ввожу два целых числа. Если первое число больше второго на 10, то выведите YES, иначе NO.
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a==b && a==c) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
