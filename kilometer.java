import java.util.Scanner;

public class kilometer
{
	
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the distance in km");
double km = sc.nextInt();



double mile = km * 0.621371; 
System.out.println("distance in miles is "+ mile);



}
}