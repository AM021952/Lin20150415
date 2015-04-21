import java.util.Scanner;

public class Classtest
{	
	public static void main(String[] args)
	{
		int num1=0;
		int num2=0;
		Scanner input = new Scanner (System.in);
		
		
		String nn;//運算符號

		System.out.println("輸入第一個數: ");
		num1 = input.nextInt();

		System.out.println("輸入第二個數: ");
		num2 = input.nextInt();

		System.out.println("輸入運算符號( + - * / ): ");
		nn = input.next();

		if(nn.equals("+"))
			r(num1,num2);

		if(nn.equals("-"))
			t(num1,num2);

		if(nn.equals("*"))
			y(num1,num2);

		if(nn.equals("/"))
			u(num1,num2);
		

		
	}


	public static void r(int a,int b)
	{
		System.out.println("相加="+(a+b));
	}
	public static void t(int a,int b)
	{
		System.out.println("相減="+ (a-b));
	}
	public static void y(int a,int b)
	{
		System.out.println("相乘="+ (a*b));
	}
	public static void u(int a,int b)
	{
		System.out.println("相除="+ (new Float(a).floatValue()/b));
	}
}