import java.util.Scanner;

public class Classtest
{	
	public static void main(String[] args)
	{
		int num1=0;
		int num2=0;
		Scanner input = new Scanner (System.in);
		
		
		String nn;//�B��Ÿ�

		System.out.println("��J�Ĥ@�Ӽ�: ");
		num1 = input.nextInt();

		System.out.println("��J�ĤG�Ӽ�: ");
		num2 = input.nextInt();

		System.out.println("��J�B��Ÿ�( + - * / ): ");
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
		System.out.println("�ۥ[="+(a+b));
	}
	public static void t(int a,int b)
	{
		System.out.println("�۴�="+ (a-b));
	}
	public static void y(int a,int b)
	{
		System.out.println("�ۭ�="+ (a*b));
	}
	public static void u(int a,int b)
	{
		System.out.println("�۰�="+ (new Float(a).floatValue()/b));
	}
}