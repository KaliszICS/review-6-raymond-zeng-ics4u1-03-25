public class PracticeProblem {

	public static void main(String args[]) {
		
	}
	public static int sum(int num1, int num2){

	
		return (num1 + num2);
	}
	public static int difference(int num1, int num2){

		return (num1 - num2);
	}
	public static double product(double num1, double num2){ 
		return (num1 * num2);
		
	}
	public static String removeFirst(String text){
		return (String)(text.substring(1));
	}
	public static int combinedLength(String text1, String text2){
		return (text1.length() + text2.length());
	}
	public static Boolean isEven(int num){
		return (num % 2 == 0);
	}
	public static Boolean isOdd(int num){
		return (num % 2 != 0);
	}
	public static Boolean isPositive(int num){
		return (num > 0);
	}
	public static Boolean isNegative(int num){
		return (num < 0);
	}
}
