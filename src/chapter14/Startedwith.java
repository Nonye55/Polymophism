package chapter14;

public class Startedwith {

	public static void main(String[] args) {
		String[]strings = {"started","starting","ended","ending"};
		
		for (String string : strings) {
			if(string.startsWith("st"))
				System.out.printf("\"%s\" starts with\"st\"%n",string);
			}
		
		for (String string : strings) {
			if(string.startsWith("ar",2))
				System.out.printf("\"%s\" starts with\"ar\"at position 2%n",string);;
		}
	}

}
