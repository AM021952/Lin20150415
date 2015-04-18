import java.util.Scanner;


public class Method01 {

	public static void main(String[] args) {

		int num1,num2;
		String x;		

		Scanner input=new Scanner(System.in);
		System.out.println("請輸入兩個數字:");
		num1=input.nextInt();
		num2=input.nextInt();
		
		System.out.println("請輸入運作符號:");
		x=input.next();
		
		if(x.equals("+")){
			add(num1,num2);
		}else{
			System.out.println("無法執行喔.....");
		}
	}
	
	public static void add(int n1,int n2){
		System.out.println((n1+n2));
	}

}
