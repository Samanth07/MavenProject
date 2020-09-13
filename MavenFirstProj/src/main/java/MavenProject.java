import java.util.Scanner;

public class MavenProject {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter First number");
		int num1=obj.nextInt();
		
		System.out.println("Enter Second number");
		int num2=obj.nextInt();
		
		int sum=num1+num2;
		
		System.out.println("Addition Result: "+sum);

	}

}
