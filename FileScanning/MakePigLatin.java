public class MakePigLatin {

    public static boolean isVowel(String s) {
	if (s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e") || s.equalsIgnoreCase("i") || s.equalsIgnoreCase("o") || s.equalsIgnoreCase("u")) {
	    return true;
	} 
	return false;
    }

    public static String ending(String s) {
	if (isVowel(s.substring(0,1))) {
	    return "yay";
	}
	else {
	    return "ay";
        }
    }

    public static String pigLatin(String s) {
	String toMove = "";
	String beginning = "";
	boolean vowelFound = false;
	for (int i = 0; i < s.length(); i++) {
	    if (!vowelFound && isVowel(s.substring(i,i+1))) {
		vowelFound = true;
		beginning += s.substring(i,i+1);
	    } 
	    else if (!vowelFound) {
		toMove += s.substring(i,i+1);
	    }
	    else {
		beginning += s.substring(i,i+1);
	    }
	}
	return beginning + toMove + ending(s);
    }

    public static void main(String[]args) {
	System.out.println(pigLatin("pig"));
	System.out.println(pigLatin("banana"));
	System.out.println(pigLatin("eat"));
    }
}