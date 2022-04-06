import java.util.Scanner;
class calculate {

	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		double x;
		double y;
		double z;
		
		System.out.println("enter:");
		x=input.nextDouble();
		System.out.println("enter another");
		y=input.nextDouble();
		z=x * y;
		System.out.println(z);
	}

}
