package extraCredit3;

import java.util.Arrays;
import java.util.*;
// Array concept is enough here
public class IdentifyMaxValue {	 
	
	public void thirdMax(int[] listOfValue)
	{
		int arraySize=listOfValue.length;
		if(arraySize<=2){
			Arrays.sort(listOfValue);
			System.out.println("the max value is:"+(listOfValue[arraySize-1]));
		}
		else
		{
			Arrays.sort(listOfValue);
			System.out.println("the third maximum value:"+(listOfValue[arraySize-3]));
		}
		
	}

	public static void main(String[] args) {
		
		int[] listOfValue={1,5,8,7,56,78,100};
		IdentifyMaxValue maxObject=new IdentifyMaxValue();
		maxObject.thirdMax(listOfValue);
		 

	}

}
