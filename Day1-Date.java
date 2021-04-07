package A2;

import java.util.*;
public class Date {


	public static void main(String[] args) {
		System.out.println("Enter the date: ");
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		if(d%10==1){
			System.out.println(d+"st");
		}
		else if(d%10==2){
			System.out.println(d+"nd");
                }
		else{
			System.out.println("Wrong date");
		}
	}

}
