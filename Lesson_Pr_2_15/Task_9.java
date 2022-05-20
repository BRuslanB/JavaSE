/*
Создайте программу, которая поможет Арсену быстро выучить названия 12-ти месяцев на английском. Арсен будет вводит порядковый номер того или иного месяца в консоль, а далее программу будет выводить наименование с заглавной буквы как в примерах ниже, но а если такого месяца не существует, то выводит Wrong Input.
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>20) {
            a=a/6;
        }else{
            a=a*6;
        }
        System.out.println(a);
    }
}
