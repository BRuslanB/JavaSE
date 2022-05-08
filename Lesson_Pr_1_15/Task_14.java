import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String spec = in.next();
        String job = in.next();
        int salary = in.nextInt();
        System.out.println(spec + ", " + job + ", " + salary);
    }
}