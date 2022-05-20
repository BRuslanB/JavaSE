/*
Напишите программу, которая проверяет делиться ли значение введенное с консоли на 17. Если значение делится, программа выводит DIVISIBLE BY 17, иначе ничего выводить не надо.
/*
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n>=10 && n<=20) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
