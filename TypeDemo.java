public class TypeDemo {
    public static void main(String[]args) {
	int a = 1;
	double x = 3.1342;
	char c = '4';
	String s = "oops";
	boolean isOK = true;

	/*is integer*/
	System.out.println(a+a);

	/*is double*/
	System.out.println(x+a);

	/*is double*/
	System.out.println(x+x);

	/*s+c is a string, then s+c+a is a string*/
	System.out.println(s+c+a);

	/*s+a is a string*/
	System.out.println(s+a+c);

	/*Characters get converted to doubles (char + int) - it's broader
	a+c is a float - c converted to ASCII */
	System.out.println(a+c+s);

	/*(1 + ASCII for A) becomes integer + oops --= becomes string */
	System.out.println(a+'A'+s);
    }
}