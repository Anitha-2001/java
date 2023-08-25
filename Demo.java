package interfaceexample;
interface Drawable
{
	void Area();
	void volume();
}
class Circle implements Drawable
{
		public void Area() 
         {
			int r=3;
			System.out.println("Area:"+3.14*r*r);
			
		} 
		@Override
		public void volume() 
		{
			int r=3;
			System.out.println("volume:"+2*3.14*r);
		}
}
class Square implements Drawable
{

			@Override
			public void Area() 
			{
				int s=4;
				System.out.println("Area:"+s*s);
			
				
			}

			@Override
			public void volume() 
			{
				int s=6;
				System.out.println("volume:"+s*s*s);
			}
}
class Rectangle implements Drawable
{

					@Override
					public void Area() 
					{
						int l=4;
						int b=6;
						System.out.println("Area:"+l*b);
						
						
					}
					@Override
					public void volume() 
					{
						int l=6;
						int b=3;
						int w=4;
						System.out.println("volume:"+l*b*w);
						
					}
				}			
public class Demo  {

	public static void main(String[] args) {
		Drawable d =new Circle();
		d.Area();
		d.volume();
		Drawable d1 = new Square();
		d1.Area();
		d1.volume();
		Drawable d2 = new Rectangle();
		d2.Area();
		d2.volume();
		

	}

}
