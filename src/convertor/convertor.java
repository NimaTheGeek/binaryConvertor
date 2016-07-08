package convertor;
import java.math.BigInteger;
import java.util.*;

public class convertor {

	public static void main(String[] args) {

		
		System.out.println("Type in your number:");

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String bigInteger = scan.nextLine();
		//System.out.println(bigInteger);
		System.out.println("Pick what type of conversion you want to do by choosing the number given\n"
				+ "1. Decimal to Binary\n"
				+ "2. Binary to Decimal\n"
				+ "3. Decimal to type A\n"
				+ "4. Type A to Decimal\n"
				+ "5. Binary to type A\n"
				+ "6. Type A to Binary\n"
				+ "7. Decimal to type B\n"
				+ "8. Type B to Decimal\n"
				+ "9. Binary to type B\n"
				+ "10. Type B to Binary\n"
				+ "11. Type A to type B\n"
				+ "12. Type B to type A\n"
				+ "13. convert to all");
		int option = scan.nextInt();
		
		switch(option){
			
			case 1: decToBin(bigInteger);
			case 2: binToDec(bigInteger);
			case 3: decToA(bigInteger);
			case 4: aToDec(bigInteger);
			case 5: binToA(bigInteger);
			case 6: aToBin(bigInteger);
			case 7: decToB(bigInteger);
			case 8: bToDec(bigInteger);
			case 9: binToB(bigInteger);
			case 10: bToBin(bigInteger);
			case 11: aToB(bigInteger);
			case 12: bToA(bigInteger);
			case 13: convertToAll(bigInteger);
			//default: System.out.println("wrong choice!");
		
		}

	}

	//1
	private static String decToBin(String temp){
		
		String bin = new BigInteger(temp).toString(2);
		System.out.println(bin);		
		return bin;
	}
	
	//2
	private static String binToDec(String temp){
		
		String number= null;
		BigInteger result;
		int [] array = new int[temp.length()];
		int power = temp.length()-1;
		result = BigInteger.valueOf((long) ((temp.charAt(0) - 48) * (Math.pow(2, power--))));
		
		for(int i = 1; i < temp.length() ; i++){
			// minus 48 because temp is string and charAt gives the asci code
			array[i] = temp.charAt(i) - 48 ;

			//convert int to bigInteger
			result = result.add(BigInteger.valueOf((long) (array[i] * (Math.pow(2, power))))) ;
			power --;
		}
		System.out.println(result);		
		number = result.toString();
		return number;
	}
	
	//3
	private static String decToA(String temp){
		String number= null;
		
		return number;
		
	}
	
	//4
	private static String aToDec(String temp){
		String number= null;
		
		return number;
		
	}
	
	//5
	private static String binToA(String temp){
		String number= null;
		
		return number;
		
	}
	
	//6
	private static String aToBin(String temp){
		String number= null;
		
		return number;
		
	}
	
	//7
	private static String decToB(String temp){
		String number= null;
		
		return number;
		
	}
	
	//8
	private static String bToDec(String temp){
		String number= null;
		
		return number;
		
	}
	//9
	private static String binToB(String temp){
		String number= null;
		
		return number;
		
	}
	//10
	private static String bToBin(String temp){
		String number= null;
		
		return number;
		
	}
	//11
	private static String aToB(String temp){
		String number= null;
		
		return number;
		
	}
	//12
	private static String bToA(String temp){
		String number= null;
		
		return number;
		
	}
	//13
	private static String convertToAll(String temp){
		String number= null;
		
		return number;
		
	}
	
	
}
