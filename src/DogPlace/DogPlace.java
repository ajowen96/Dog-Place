package DogPlace;

import java.util.ArrayList;

public class DogPlace {
	public static int number;
	public static String result ="";
	public static ArrayList<String>resultList = new ArrayList<>();
	public static String stringCheck;
	public static void place(int num) {
		for (int i = 1; i<=100; i++) {
			stringCheck = Integer.toString(i);
			if (stringCheck.charAt(stringCheck.length()-1) == '1') {
				if (stringCheck.length() == 2 && stringCheck.charAt(0) == '1') {
					result = "th";
				}
				else {
					result = "st";
				}
			}
			if (stringCheck.charAt(stringCheck.length()-1) == '2') {
				if (stringCheck.length() == 2 && stringCheck.charAt(0) == '1') {
					result = "th";
				}
				else {
					result = "nd";
				}
			}
			if (stringCheck.charAt(stringCheck.length()-1) == '3') {
				if (stringCheck.length() == 2 && stringCheck.charAt(0) == '1') {
					result = "th";
				}
				else {
					result = "rd";
				}
			}
			if (stringCheck.charAt(stringCheck.length()-1) != '1' && stringCheck.charAt(stringCheck.length()-1) != '2' && stringCheck.charAt(stringCheck.length()-1) != '3') {
				result = "th";
			}
			if (i != num) {
				String finalString = stringCheck + result;
				resultList.add(finalString);
			}
			result = "";
		}
		for (int count = 0; count < resultList.size(); count++) {
			System.out.print(resultList.get(count)+ ", ");
		}
	}
}