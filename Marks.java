package A3;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter english marks");
		int x=sc.nextInt();
		
		System.out.println("Enter for java");
		int y=sc.nextInt();
		
		System.out.println("Enter for db");
		int z=sc.nextInt();
		
		System.out.println("Enter for springTools");
		int a=sc.nextInt();
		
		int avg=(x+y+z+a)/3;
		int total=(x+y+z+a);
		
		System.out.println(avg);
		System.out.println(total);
		
	}

}
