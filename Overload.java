package practice;

 class Overloadj {
	public static void exm(int a,int b) {
		System.out.println(a+b);
	}
	public static void exm(float a,float b) {
		System.out.println(a+b);
		
	}
 }
 class override{
	 public static void exm(int a,int b) {
		 System.out.println(a-b);
	 }
	 public static void exm(float a,float b) {
		 System.out.println(a-b);
	 }
 }
 class Multiply extends Overloadj{
	 public static void exm(int a,int b) {
		 System.out.println(a*b);
	 }
	 public static void exm(float a,float b) {
		 System.out.println(a*b);
	 }
 }
 class Divide extends Overloadj{
	 public static void exm(int a,int b) {
		 System.out.println(a/b);
	 }
	 public static void exm(float a,float b) {
		 System.out.println(a/b);
	 }
 }
 public class Overload{
	 

	public static void main(String[] args) {
		Overloadj ol=new Overloadj();
		ol.exm(5, 7);
		ol.exm(3.4f, 4.6f);
		Overloadj or=new Overloadj();
		or.exm(5, 4);
		or.exm(3.2f, 4.2f);
		Multiply m=new Multiply();
		m.exm(2, 5);
		m.exm(3.9f, 6.8f);
		Divide d=new Divide();
		d.exm(6, 3);
		d.exm(5.4f, 6.9f);
		
	}
 
		

	}


