package assignment;

public class CallingStaticNonStaticM {

	public static void add()
		{
			int a;//declaration
			a=10;//initialization
			int b=20;
			System.out.println(a+b);//o/p=30
		}
		static void sub()
		{
			int a=20;//declaration or initialization
			int b=10;
			System.out.println(a-b);//o/p=10
		}
		void mul()
		{
			int a=20;
			int b=40;
			System.out.println("multiplication output: "+(a*b));//o/p=200
		}
		void div()
		{
			int a=40;
			int b=20;
			int res=a/b;
			System.out.println("q :"+res);//Remainder: 2
		}
		void mod()
		{
			int a=4;
			//int b=2;
			int result=a%2;
			System.out.println("R :"+result);// 0
		}
		public static void main(String[] args) {
		CallingMultipleNonStaticMethod	n1=new CallingMultipleNonStaticMethod();
			add();
		    sub();
			n1.mul();
			n1.div();
			n1.mod();	
		}
	

	}

