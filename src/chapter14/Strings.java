package chapter14;

public class Strings {

	private static int count;

	

	public static void main(String[] args) {
		String A1 ="hello";
		char[] charArray = new char[5];
		
		
//		charArray[3] = 0;
//		System.out.println(charArray);
		
		
		System.out.printf("A1: %s",A1);
		
		System.out.printf("%nthe lenght is: %d",A1.length());
		
		
		System.out.printf("%n the String reversed  is :");
//		reverse
			for(int count = A1.length()-1; count >= 0;count-- );
				System.out.printf("%c", A1.charAt(count));
				
//			copy characters from string into charArray	
			A1.getChars(0, 5, charArray, 0);
			System.out.printf("%n the character Array is:");
			
			
			
			for (char character: charArray )
				System.out.print(character);
			
			System.out.println();
	}
	
	

}
