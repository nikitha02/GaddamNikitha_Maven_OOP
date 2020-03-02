package epam.com.Maven_OOP;

public class Temptation implements Chocolates {
	double weightOfChoc = 60;

	public double calcWeight(int numOfChoc) {
		return numOfChoc * weightOfChoc;
	}

}
