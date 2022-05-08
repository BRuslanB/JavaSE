import java.util.Scanner;

public class Main{
  public static void main (String[] args){
    Scanner in = new Scanner(System.in);
    String name = in.next();
    String surname = in.next();
    Byte age = in.nextByte();
    String country = in.next();
    System.out.println("Name: " + name + "\n" + "Surname: " + surname + "\n" + "Age: " + age + "\n" + "Country: " + country);
  }
}