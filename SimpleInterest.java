import java.util.Scanner;

public class SimpleInterest{
	
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the Principal");
int p = sc.nextInt();

System.out.println("Enter the Rate ");
int r = sc.nextInt();

System.out.println("Enter the Time");
int t = sc.nextInt();

double si= (p*r*t)/100;
System.out.println("Simple interest is "+ si);


}
}