import java.util.Scanner;
public class jcastro4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println(“1. Say hello/n2.Say Bye/n3.Say Hola/n4.Say Adios:”);
		Int choice = input.nextInt();

		if(choice ==1){
			System.out.println(“Hello, Hello, Hello”);
		}else if(choice ==2){
			System.out.println(“BYE, Bye, Bye”);
		}else if(choice ==3){
			System.out.println(“Hola, Hola, Hola”);
		}else{
			System.out.println(“Adios, Adios, Adios”);
		}
	}
}

