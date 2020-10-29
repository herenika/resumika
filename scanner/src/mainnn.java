import java.util.Scanner;

public class mainnn {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		//printName();
		//printAge();
		//printGender();
		//printBornday();
		//printCitizenship();
		//printMaritalstatus();
		//printAdress();
		//printHp();
		//printWorkexperience();
		//printLanguage1st();
		//printLanguage2nd();
		//printAwards();
		//printGrade();
		//printGpa();
		

		
	}

	public static void printName() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = in.next();
		System.out.println("name " + name);
		
	}

	public static void printAge() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		System.out.println("age " + age + " years old");
	}

	public static void printGender() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your gender: ");
		String str = in.next();
		char gender = str.charAt(0);
		System.out.println("gender " + gender);
	}

	public static void printBornday() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your bornday: ");
		String bornday = in.next();
		System.out.println("bornday " + bornday);
		
	}

	public static void printCitizenship () {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your citizenship: ");
		String citizenship = in.next();
		System.out.println("citizenship " + citizenship);
		
	}

	public static void printMaritalstatus() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your marital status: ");
		String marital = in.next();
		System.out.println("marital status: " + marital);
		
	}

	public static void printAdress() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your home address: ");
		String home = in.next();
		System.out.println("home address " + home);
		
	}

	public static void printHp () {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your hp: ");
		String hp = in.next();
		System.out.println("hp " + hp);
	}

	public static void printWorkexperience () {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your work experience: ");
		String work = in.next();
		System.out.println("work experience " + work);
	}

	public static void printLanguage1st() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your language1st: ");
		String language1st = in.next();
		System.out.println("languagae1st " + language1st);
		
	}

	public static void printLanguage2nd() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your language2nd: ");
		String language2nd = in.next();
		System.out.println("language2nd " + language2nd);
		
	}
	
	public static void printAwards() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter your awards&certificate: ");
		String awards = in.next();
		System.out.println("awards&certificate " + awards);
	}

	public static void printGrade() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter grade STIA1113: ");
		String sca =in.next();
		char grade = sca.charAt(1);
		System.out.println("grade " + grade);
		
	}

	public static void printGpa() {
		Scanner in=new Scanner(System.in);
		
		System.out.print("Enter GPA semester 1: ");
		double num1 = in.nextDouble();
		System.out.print("Enter GPA semester 2: ");
		double num2 = in.nextDouble();
		
		double sum = num1 + num2;
		double totalgpa = sum/2;
		System.out.printf("CGPA for current semester is: %4.2f", totalgpa);
	}

}




