/*
Напишите программу, где я ввожу три числа. Если все числа одинаковые, то выведите YES, иначе NO.
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>0) {
            a++;
        }else if (a<0) {
            a=a-2;
        }else{
            a=10;
        }
        System.out.println(a);
    }
}
