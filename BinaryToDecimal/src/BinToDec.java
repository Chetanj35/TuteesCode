import java.util.Scanner;

public class BinToDec {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Binary number: ");
		int num=sc.nextInt();
		
		int i=0,temp;
		double result=0;
		
		while(num!=0)
		{		
				temp=num%10;
				result=result+(temp* Math.pow(2,i));
				i++;
				num/=10;
		}
		
		System.out.println("Decimal Conversion is"+result);
	}
}
