import java.util.*;

public class IntegerDemo {
    public static void main(String[]args) {
	int N = Integer.parseInt(args[0]);
	ArrayList<Integer> thingy = new ArrayList<Integer>(N);
	for (int i = 0; i < N; i++) {
	    thingy.add(new Integer((int)(Math.random()*6)));
	}
	System.out.println(thingy);
    }
}