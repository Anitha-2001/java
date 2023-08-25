package practices;

public class WithoutREverseStringExample {

	public static void main(String[] args) {
		String str ="Indian";
		char chars[] = str.toCharArray();
		for(int i=chars.length-1;i>=0;i--) {
				System.out.print(chars[i]);

	}

}
}
