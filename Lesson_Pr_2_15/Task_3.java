/*
Создайте программу, которая принимает c консоли цифру от 1 до 5 включительно, далее программа должна вывести ONE - если ввели 1, TWO - если ввели 2, THREE - если ввели 3 … итд.
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2 == 0) {
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }
    }
}
