import java.util.Scanner;

public class power{
	
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the base");
int b = sc.nextInt();

System.out.println("Enter the exponent");
int e = sc.nextInt();

int p = (int) Math.pow(b, e); 
System.out.println("Result is "+ p);



}
}