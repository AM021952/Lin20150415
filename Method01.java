import java.util.Scanner;


public class Method01 {

	public static void main(String[] args) {

		int num1,num2;
		String x;		

		Scanner input=new Scanner(System.in);
		System.out.println("�п�J��ӼƦr:");
		num1=input.nextInt();
		num2=input.nextInt();
		
		System.out.println("�п�J�B�@�Ÿ�:");
		x=input.next();
		
		if(x.equals("+")){
			add(num1,num2);
		}else{
			System.out.println("�L�k�����.....");
		}
	}
	
	public static void add(int n1,int n2){
		System.out.println((n1+n2));
	}

}
