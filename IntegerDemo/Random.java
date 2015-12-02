public class Random {
    private int rand;

    private void setRand() {
	rand = (int)(Math.random()*6);
    }

    public Random() {
	setRand();
    }

    public int getRand() {
	return rand;
    }
    
}