public class Driver{
    public static void main(String[]qbert){
        //constructor initializes the values 
        Car c = new Car("Honda","Civic","Habanero",9001);
        
        //this prints the address of the object
        System.out.println(c);

        //we need a better way to print an object... that is your homework!
        System.out.println(c.make);
        System.out.println(c.model);
        System.out.println(c.color);
        System.out.println(c.price);

        //comment

        /*
          multi line
          comments



        */
    }
}