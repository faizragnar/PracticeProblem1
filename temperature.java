import java.util.Scanner;
public class temperature{
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the temperature in celsius ");
int c = sc.nextInt();

int f = (c * 9/5) + 32;
System.out.println(f + "F");

}
}