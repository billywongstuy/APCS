public class Driver {
    public static void main {
	//Java files can compile classes from different Java files from same directory as an OBJECT
	Greeter g1;
	g1 = new Greeter();
	g2 = new Greeter();
	g1.message = "HELLLO!";
	g2.message = "Hola!";
	g1.greet();
	g2.greet();
    } 
}