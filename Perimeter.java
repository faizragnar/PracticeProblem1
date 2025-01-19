import java.util.Scanner;

public class Perimeter{
	
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the Length");
int l = sc.nextInt();

System.out.println("Enter the Breath");
int b = sc.nextInt();

double p=2*(l+b);
System.out.println("perimeter is "+ p);


}
}