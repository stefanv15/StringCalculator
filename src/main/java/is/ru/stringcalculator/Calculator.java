package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){

		if(text.contains("-")){
			NegativeNumbers(text);
		}

		if(text.equals(""))
			return 0;

		if(text.contains("\n")){
			text = text.replace("\n",",");
		}

		if(text.contains(",")){
			int sum = SumOfUnknownNumbers(text);
			return sum;
		}
		else
			return toInt(text);
	}
	public static int SumOfUnknownNumbers(String text){
		String [] numbers = text.split(",");
		int sum = 0;

		for(int i = 0; i < numbers.length; i++){
		
			if(toInt(numbers[i]) > 1000)
	   			numbers[i] = numbers[i+1];
			else
				sum += toInt(numbers[i]);
			}
			return sum;
		}

	public static void NegativeNumbers(String text){
		String [] numbers = text.split(",");
		StringBuilder negatives = new StringBuilder();
		for(int i = 0; i < numbers.length; i++){
			if(toInt(numbers[i]) < 0)
				negatives.append(numbers[i] + ",");
		}
			
		throw new IllegalArgumentException("Negatives not allowed: " + negatives.toString());
	}
		
	private static int toInt(String text){
		return Integer.parseInt(text);
	}
}
