package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text){
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

			sum += toInt(numbers[i]);
		}
		return sum;
	}

	private static int toInt(String text){
		return Integer.parseInt(text);
	}
}