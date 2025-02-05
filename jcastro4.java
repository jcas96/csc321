import java.util.Scanner;
public class jcastro4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Choice 1");
		System.out.println("Choice 2");
		System.out.println("Choice 3");
		System.out.println("Choice 4");

		int choice = input.nextInt();

		if(choice ==1){
			System.out.println("The Grass is always greener");
		}else if(choice ==2){
			System.out.println("Be the change you wish to see");
		}else if(choice ==3){
			System.out.println("BE yourself, everybody else is already taken");
		}else{
			System.out.println("Without Music, life would be a mistake");
		}
	}
}
