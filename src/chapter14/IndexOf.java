package chapter14;

public class IndexOf {

	public static void main(String[] args) {
		
		String letters = "abcdefghijklmabcdefghijklm";
		
		String s1 = "good";
		String s2 =	 "morning";
		String s3 = " dog  ";
		
		
//			test indexOf to locate a character in s= a string
		System.out.printf("'c' is located at index %d%n",letters.indexOf('c'));
				

		System.out.printf("'a' is located at index %d%n",letters.indexOf('a', 7));
		
//		LastIndeOf
		System.out.printf("  last 'e' is located at index %d%n",letters.lastIndexOf('e'));
		
		System.out.printf(" last 'j' is located at index %d%n",letters.lastIndexOf('j',25));
		
//		locate subsstring
		System.out.printf("\"def\" is located at index %d%n",letters.indexOf("def"));
	
		System.out.printf("\"def\" is located at index %d%n",letters.indexOf("def",4));
		
//		lat indexof substring
		System.out.printf( " last\"def\" is located at index %d%n",letters.lastIndexOf("def"));
	
		System.out.printf( " last\"def\" is located at index %d%n",letters.lastIndexOf("def",25));
		
		System.out.printf( " last\"hello\" is located at index %d%n",letters.lastIndexOf("hello"));
		
//		creating Substring
		System.out.printf(" substring from index 15 to end \"%s\"%n",letters.substring(15));
		
		System.out.printf( "subsrtig from index 3  stop at 6 is \"%s\"%n",letters.substring(3, 6));
		
//		StringC conatination
		
		System.out.printf("s1 =%s%n s2=%s%n",s1,s2);
		
		System.out.printf("concatinate s1+s2  = %s%n", s1.concat(s2));
		
		System.out.printf("s1 after concatinating =  %s%n", s1);
			
		System.out.printf("replace g in s1 with o ins2 = %s%n",s1.replace("g", "o"));
		
		System.out.printf("change s1 to uppercase = %s%n",s1.toUpperCase());
		
//		trim
		
		System.out.printf("s3 after trim = %s%n",s3.trim());

	
//		StringBuilder.
			
		StringBuilder buffer = new StringBuilder("Hello, there?");
		
		System.out.printf("%s%n",buffer.capacity());
		
	buffer.ensureCapacity(100);
	System.out.printf("new capacity %s%n",buffer.capacity());
		buffer.setLength(100);
		
		System.out.printf("the new length =%s%n buffer is = %s%n ",
				buffer.length(),buffer.toString());
		
		buffer.setCharAt(0, 'H');
		buffer.setCharAt(6,'T');
		System.out.printf("%n buffer = %s",buffer.toString());
		
		buffer.reverse();
		System.out.printf("%nbuffer = %s%n",buffer.reverse());
		
		
		float floatvalue = 3.4f;
		double doublevalue= 333.3;
//		StringBuilder buffer = new StringBuilder();
		
		buffer.deleteCharAt(10);
		buffer.delete(2, 6);
		System.out.printf("after delete %s%n", buffer.toString());
		
	}
		
}

