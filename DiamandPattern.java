package pattern;

public class DiamandPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size =5;
		int num=1;
		for(int i=1;i<=size;i++) {
			for(int j=size;j>i;j--) {
			System.out.print(" ");
			
			
		}
			for(int k=0;k<i*2-1;k++) {
				System.out.println(num++);
			}
			num=1;
			System.out.println();
		

	}
		for(int i=1;i>=size-1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
				
			}
			for(int k=size-1;k>i*2-1;k++) {
				System.out.print(num++);
			}
		}

}
}