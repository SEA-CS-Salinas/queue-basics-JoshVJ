package QueuesIntro2;
/*
 * Test runner for the PalinList checks multiple 
 * tests to ensure the PalinList class works as intended.
 *  @author Joshua Vento-Jones
 */
public class PalinListRunner {

	public static void main(String[] args) {
		PalinList josh = new PalinList("one two three two one");
		System.out.println(josh);
		josh.setList("1 2 3 4 5 one two three four five");
		System.out.println(josh);
		
		josh.setList("a b c d e f g x y z g f h");
		System.out.println(josh);
		
		josh.setList("racecar is racecar");
		System.out.println(josh);
		
		josh.setList("1 2 3 a b c c b a 3 2 1");
		System.out.println(josh);
		
		josh.setList("chicken is a chicken");
		System.out.println(josh);
		
		josh.setList("chicken is chicken");
		System.out.println(josh);
	}

}
