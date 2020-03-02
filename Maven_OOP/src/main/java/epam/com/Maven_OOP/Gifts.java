package epam.com.Maven_OOP;
import java.util.*;
public class Gifts {
	static Scanner scan = new Scanner(System.in);
	static Map<String, Integer> mp = new HashMap<String, Integer>() 
	{{ 
		put("Temptation", 0); put("MilkyBar", 0); put("Tea", 0); put("Kalakan", 0); put("Laddu", 0); put("Venila", 0);
	}};
	//main method
	public static void main(String args[]) {
		//creating sweet objects
		Sweet Kalakan = new Sweet();
		Kalakan.setWeight(30);
		Sweet chikki = new Sweet();
		chikki.setWeight(45);
		Sweet Venila = new Sweet();
		Venila.setWeight(25);
		Temptation dc = new Temptation();
		MilkyBar g = new MilkyBar();
		Alpenliebe c = new Alpenliebe();
		//taking input from user
		char areMore = 'y';
		System.out.println("\n1. Dark Chocolate\n2. MilkyBar\n3. Tea\n4. kajjukatli\n5. rasgulla\n6. kalakhand");
		while (areMore == 'y') {
			System.out.println("Select what you find: ");
	        int n = scan.nextInt();
	        switch(n) {
	        case 1: mp.put("Temptation", mp.get("Temptation")+1); break;
	        case 2: mp.put("MilkyBar", mp.get("MilkyBar")+1); break;
	        case 3: mp.put("Alpenliebe", mp.get("Alpenliebe")+1); break;
	        case 4: mp.put("kajukatli", mp.get("kajjukatli")+1); break;
	        case 5: mp.put("rasagula", mp.get("rasagula")+1); break;
	        case 6: mp.put("kalakhand", mp.get("kalakhand")+1); break;
	        }
	        System.out.println("Are there more sweets or chocolates? (y/n): ");
	        areMore = scan.next().charAt(0);
		}
		scan.close();
		//calculating total weight and number of candies
		double totalWt = dc.calcWeight(mp.get("Temptation")) + g.calcWeight(mp.get("MilkyBar")) + c.calcWeight(mp.get("Alpenliebe"));
		totalWt += Venila.calcWeight(mp.get("Venila")) + chikki.calcWeight(mp.get("chikki")) + Kalakan.calcWeight(mp.get("Kalakan"));
		System.out.println("Total gift weight: " + totalWt);
		int quantity = 0;
		System.out.println("Number of individual candies: ");
		for (String candy : mp.keySet()) {
			System.out.println(candy + " : " + mp.get(candy));
			quantity += mp.get(candy);
		}
		System.out.println("Total number of candies: " + quantity);
	}
}

	
	


