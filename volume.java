import java.util.Scanner;

public class volume{
	
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the Radius");
int r = sc.nextInt();

System.out.println("Enter the Height");
int h = sc.nextInt();

double area=Math.PI * r*r*h;
System.out.println("volume of cylinder is "+ area);


}
}