/*
Напишите программу, где Петя вводит в каком классе он учится, а  программа должна определить и выдать результат прописью как показано в примерах ниже. Помните, что с 1-го по 4-ый включительно классы - это Beginners School, с 5-го по 9-ый включительно - это Middle School и c 10-го по 11-ый включительно - это High School.
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>100 || a<-100) {
            a=0;
        }else {
            a++;
        }
            System.out.println(a);
    }
}
