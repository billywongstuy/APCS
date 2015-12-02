import java.util.Scanner;

public class Input {

    public static void main(String[]args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Type something.");
	//String res = in.next();
	String result = in.nextLine();
	//System.out.println(res);
	System.out.println(result);
    }
}