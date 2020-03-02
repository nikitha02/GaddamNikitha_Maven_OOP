package epam.com.Maven_OOP;

public class Sweet extends Sweets {
	
	@Override
	void setWeight(double weight) {
		// TODO Auto-generated method stub
		this.weight = weight;
	}
	double calcWeight (int numOfSweets) {
		return numOfSweets * weight;
	} 
}
