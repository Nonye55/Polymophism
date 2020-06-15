package chapter14;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenizing {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("enter a sentence and press enter");
		 String sentence = scanner.nextLine();
		 
//		 process user sentence
		 String[] tokens = sentence.split(" ");
		 System.out.printf("Number of the elements:%d%nthe tokens are:%n",tokens.length);
		  
		 for(String token : tokens)
			 System.out.println(token);
			 
	}

}
