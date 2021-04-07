package A1;
import java.util.Scanner;
public class Salaryy {



	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic salary");
		double x=sc.nextInt();
		double HRA=0.4*(x);
		double DA=0.6*(x+HRA);
		double a=(x+HRA+DA);
		double Tax=0;
		if(a<200000)
		{
			Tax=0*a;
			
		}
		else if (200000<=a && a<=600000)
		{
			Tax=0.1*DA;
			
		}
		else if  (a>=600000)
		{
			Tax=0.2*a;
		}
		double TotalSalary=(a-Tax);
		System.out.println("The annual take home salary is: " + TotalSalary + "\nAnd the annual tax is: " + Tax + "\n");
	}
	
	
}