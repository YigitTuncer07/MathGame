import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		
		System.out.println(factorial(5));

		
	}
	public static void swapper(int int1, int int2) {
		int temp = int1;
		int1 = int2;
		int2 = temp;
		
		System.out.println("int1 : " + int1);
		System.out.println("int2 : " + int2);

		
	}
	public static int factorial(int int1) {
		
		int result = 1;
		
		for(int i = 1; i <= int1; i++) {
			result = i * result;
		}

		return result;
	
	}
	
	public static boolean isNegative(int int1) {
		String string1 = Integer.toString(int1);
		
		char char1 = string1.charAt(0);
		
		if (char1 == '-') {
			return true;
		} else {
			return false;
		}
	}
	public static void FaktoriyelZor() {
		int int1 = (int) (Math.random() * 5 + 1);
		int int2 = (int) (Math.random() * 5 + 1);
		
		int int3 = Methods.factorial(int2);
		
		int int4 = Methods.factorial(int1);
		
		int int5 = int3 + int4;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(int1 + "! + ");
		System.out.println(int2 + "! =");
		
		int yourAnswer = input.nextInt();
		
		
		if(int5 == yourAnswer) {
			System.out.println("Dogru!");
		} else {
			System.out.println("Yanlis!");
			System.out.println("Dogru cevap : " + int5);
			}
		
	}
	public static void ToplamaKolay() {


		int int1 = (int) (Math.random() * 9 + 1);
		int int2 = (int) (Math.random() * 9 + 1);
		int int3 = int1 + int2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(int1);
		System.out.print(" + " + int2 + " = ");
		
		int yourAnswer = input.nextInt();
		
		
		if(int3 == yourAnswer) {
			System.out.println("Dogru!");
		} else {
			System.out.println("Yanlis!");
			System.out.println("Dogru cevap : " + int3);
			}
		}
	public static void CikarmaKolay() {

		int int1 = (int) (Math.random() * 9 + 1);
		int int2 = (int) (Math.random() * 9 + 1);
		
		if (int1 < int2) {
			int temp = int1;
			int1 = int2;
			int2 = temp;
		}
	
		int int3 = int1 - int2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(int1);
		System.out.print(" - " + int2 + " = ");
		
		int yourAnswer = input.nextInt();
		
		
		if(int3 == yourAnswer) {
			System.out.println("Dogru!");
		
		} else {
			System.out.println("Yanlis!");
			System.out.println("Dogru cevap : " + int3);

			
		}}
	public static void CarpmaKolay() {

	int int1 = (int) (Math.random() * 9 + 1);
	int int2 = (int) (Math.random() * 9 + 1);
	int int3 = int1 * int2;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print(int1);
	System.out.print(" * " + int2 + " = ");
	
	int yourAnswer = input.nextInt();
	
	
	if(int3 == yourAnswer) {
		System.out.println("Dogru!");
		
	} else {
		System.out.println("Yanlis!");
		System.out.println("Dogru cevap : " + int3);

		
		}
	
	
}	
	public static void FaktoriyelKolay() {
		int int1 = (int) (Math.random() * 5 + 1);
				
		int int3 = Methods.factorial(int1);
				
		Scanner input = new Scanner(System.in);
		
		System.out.print(int1 + "! = ");
		
		int yourAnswer = input.nextInt();
		
		
		if(int3 == yourAnswer) {
			System.out.println("Dogru!");
	
		} else {
			System.out.println("Yanlis!");
			System.out.println("Dogru cevap : " + int3);

			
			}
		
	}
	public static void BolmeKolay() {
		
		int int1 = (int) (Math.random() * 9 + 1);
		int int2 = (int) (Math.random() * 9 + 1);
		
		if (int1 < int2) {
			int temp = int1;
			int1 = int2;
			int2 = temp;
		}
		
		int int3 = int1 * int2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(int3);
		System.out.print(" ÷ " + int2 + " = ");
		
		int yourAnswer = input.nextInt();
		
		
		if(int1 == yourAnswer) {
			System.out.println("Dogru!");
	
		} else {
			System.out.println("Yanlis!");
			System.out.println("Dogru cevap : " + int1);

			
			
		
		}
	}
	public static void ToplamaZor() {

		int int1 = (int) (Math.random() * 99 + 1);
		int int2 = (int) (Math.random() * 99 + 1);
		int int4 = (int) (Math.random() * 9 + 1);
		int int3 = int1 + int2 + int4;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(int1);
		System.out.print(" + " + int2 + " + " + int4 + " = ");
		
		int yourAnswer = input.nextInt();
		
		
		if(int3 == yourAnswer) {
			System.out.println("Dogru!");
		
		} else {
			System.out.println("Yanlis!");
			System.out.println("Dogru cevap : " + int3);

			
			}
		}
	public static void CikarmaZor() {

		int int1 = (int) (Math.random() * 99 + 1);
		int int2 = (int) (Math.random() * 99 + 1);

		if (int1 < int2) {
			int temp = int1;
			int1 = int2;
			int2 = temp;
		}
	
		int int3 = int1 - int2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(int1);
		System.out.print(" - " + int2 + " = ");
		
		int yourAnswer = input.nextInt();
		
		
		if(int3 == yourAnswer) {
			System.out.println("Dogru!");
			
		} else {
			System.out.println("Yanlis!");
			System.out.println("Dogru cevap : " + int3);

	
		}}
	public static void BolmeZor() {
		
		int int1 = (int) (Math.random() * 20 + 1);
		int int2 = (int) (Math.random() * 20 + 1);
		
		if (int1 < int2) {
			int temp = int1;
			int1 = int2;
			int2 = temp;
		}
		
		int int3 = int1 * int2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(int3);
		System.out.print(" ÷ " + int2 + " = ");
		
		int yourAnswer = input.nextInt();
		
		
		if(int1 == yourAnswer) {
			System.out.println("Dogru!");

		} else {
			System.out.println("Yanlis!");
			System.out.println("Dogru cevap : " + int1);

			
		
		}
	}
	public static void CarpmaZor() {

		int int1 = (int) (Math.random() * 9 + 1);
		int int2 = (int) (Math.random() * 9 + 1);
		int int4 = (int) (Math.random() * 5 + 1);

		int int3 = int1 * int2 * int4;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print(int1);
		System.out.print(" * " + int2 + " * " + int4 + " = ");
		
		int yourAnswer = input.nextInt();
		
		
		if(int3 == yourAnswer) {
			System.out.println("Dogru!");
		} else {
			System.out.println("Yanlis!");
			System.out.println("Dogru cevap : " + int3);

			}
		
		
	}	
}
