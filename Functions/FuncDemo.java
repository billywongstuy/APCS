public class FuncDemo {
    /*use void if no values to be returned*/
    /* foo is name of function*/
    public static void foo (int a, String s) {//a and s are parameters
	System.out.println(a+s);
    }
   
    /*You can make multiple functions with the same names as long the parameters are different*/
    public static void foo (double a, String s) {//a and s are parameters
	System.out.println(a+s);
    }

    /*int is the type of variable to be passed*/
    public static int bar(int x) {
	return 2 * x * x; 
    }

    public static boolean isEven (int x) {
	return x % 2 == 0;
    }

    /*function main is always run*/
    public static void main (String[]args) {
	System.out.println(bar(3));
	foo(10,"OOPS"); //10 and OOPS are arguments
	foo(10.0,"OOPS");
	System.out.println(isEven(4));
	System.out.println(isEven(3));
    }

}