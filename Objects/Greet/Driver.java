//we have a separate file Driver.java (or any other name) 
//This class has a main method and will create Greeter objects
public class Driver{
    public static void main(String[]args){
        //DECLARE
        Greeter g1,g2;
        //INSTANTIATE (initialize an object)
        g1 = new Greeter();
        g2 = new Greeter();

        //set the message
        g1.message = "Hey sup!";
        g2.message = "Hola!";

        //make g1 and g2 use their greet method
        g1.greet("Bob");
        g2.greet("Dylan");
        g1.greet("Annie");

    }
}