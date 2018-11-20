
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> dwarfs = new ArrayList<String>();
		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Doc");
		dwarfs.add("Grumpy");

		ArrayList<String> dwarves = new ArrayList<String>();
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Fili");
		dwarves.add("Kili");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Ori");
		dwarves.add("Oin");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");

		System.out.println("The Seven Dwarfs");
		int j = 0;
		for (int i = 0; i < dwarfs.size(); i++) {

			System.out.println(dwarfs.get((j)));
			j++;
		}
		
		System.out.println("\nThe Thirteen Dwarves");
		int k = 0;
		for (int i = 0; i < dwarves.size(); i++) {

			System.out.println(dwarves.get((k)));
			k++;
		}

	}

}
