public class Driver {
    public int sum (int [] nums) {
	int sum = 0;
	for (int i = 0; i < nums.length; i++) {
	    sum += nums[i];
	}
	return sum;
    }


    public boolean canBalance (int [] nums) {
	for (int i = 0; i < nums.length; i++) {
	    if (sum(nums[0,i+1]) == (sum(nums[i+1,nums.length-1]) {
		return true;
	     }
		    }
	 return false;
    }

    public static void main(String[]args){

    }

}