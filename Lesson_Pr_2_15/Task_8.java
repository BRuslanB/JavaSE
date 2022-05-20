/*
Дано число. Если оно меньше или равно 2019, то вывести NO, если больше или равно 2021, то вывести YES, если равно 2020, то вывести ERROR.
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a+100==b || a-100==b) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
