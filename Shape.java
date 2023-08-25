package abstractexample;
abstract class Shape1{
	abstract void CalculateArea();
}
 class Circle1 extends Shape1{

	@Override
	void CalculateArea() {
		int r=8;
		System.out.println("Area;"+3.14*r*r);
		
	}
	
}
public class Shape {

	public static void main(String[] args) {
		Circle1 c =new Circle1();
		c.CalculateArea();
		

	} 

}
