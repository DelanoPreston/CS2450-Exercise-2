import java.util.Random;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] theNumbers = new double[11];
		
		Random random = new Random();
		
		for(int i = 0; i < theNumbers.length; i++){
			theNumbers[i] = random.nextInt();
		}
		
		System.out.println("The Numbers are: ");
		for(int i = 0; i < theNumbers.length; i++){
			System.out.println(theNumbers[i]);
		}
		
		double tempSum = 0.0;
		for(int i = 0; i < theNumbers.length - 1; i++){
			tempSum += theNumbers[i];
		}
		double tempResult = tempSum / theNumbers[10];
		System.out.println("the SUM of the first 10, divided by the 11th is: " + tempResult);
	}

}
