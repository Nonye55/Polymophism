package chapter14;

public class StringCompare {

	public static void main(String[] args) {

		
		String x1 = new String("hello");
		String x2 = "goodbye";
		String x3 = "Happy Birthday";
		String x4 = "happy birthday";
		
		System.out.printf("x1 = %s%nx2 =%s%nx3 = %s%nx4", x1,x2,x3,x4);
		
		if(x1.equals("hello"))
			System.out.println("x1 equals\"hello\"");
		else
			System.out.println("x1 is not equals to \"hello\"");
		
		if(x1=="hello")
			System.out.println("x1 is the same objectas\"hello\" ");
		else
			System.out.println("x1 is not the same object as\"hello\" ");
		
		if(x3.equalsIgnoreCase(x4))
			System.out.printf("%s equals %s with case ignored%n",x3,x4);
		else 
			System.out.println("x3does not equal x4");
		
//		compare to
		System.out.printf("%nsx1.compareTo(x2) is %d",x1.compareTo(x2));
		
		System.out.printf("%nsx2.compareTo(x1) is %d",x2.compareTo(x1));
		
		System.out.printf("%nsx1.compareTo(x1) is %d",x1.compareTo(x1));
		
		System.out.printf("%nsx3.compareTo(x4) is %d",x3.compareTo(x4));
		
		System.out.printf("%nsx4.compareTo(x3) is %d%n%n",x4.compareTo(x3));
		
//		region matches
		if(x3.regionMatches(0,x4,0,5))
		System.out.println("the first 5 character of x3 and x4 match");
		else
			System.out.println("first 5 character of x3 and x4 do not match");
		
		if (x3.regionMatches(true, 0, x4, 0, 5))
			System.out.println("first 5 character of x1 and x4 match with case ignored");
		else
			System.out.println("first 5 character of x3 and x4 do not match");
		
		
		
		
		
		

		
		
	}

}
