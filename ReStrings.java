package reversedstrings;

public class ReStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "SEGA";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
	}

}
