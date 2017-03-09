package algorithms_hw;

import java.util.Arrays;

public class Helloworld {

	public static int[] denomination = {50, 25, 10, 5, 1};
	public static void main(String[] arg ){
		System.out.println("Starting now...");
		//System.out.println("Value is " + computeValue(3, 2));
		System.out.println("Change for 17 ");
		computeChange(17);
		
	}
	public static int computeValue(int base, int exp){
		int result = base;
		if(exp== 0) {
			return 1;
		}
		else{
			System.out.println(exp -1 +"\n");
			result *= computeValue(base, exp-1);
			System.out.println(" now the result is " + result);
		}
		return result;
	}
	/**
	 * Compute change using a for loop O(n)
	 * @param amount
	 */
	public static void computeChange(int amount){
		int[] changeArray = new int[5];
		for(int i=0 ; i <denomination.length; i++){
				if(amount >= denomination[i]){
					changeArray[i] = amount/denomination[i];
					amount = amount - ((amount/denomination[i])*denomination[i]);
				} else{
					continue;
				}
			}
	
		System.out.println("\nThe result is like this \n" + Arrays.toString(changeArray));		
	}
	/**
	 * Compute change using iterative approach
	 */
	public static void computeChangeIt(int amount){
		int[] changeArray = new int[5];
		int i = 0;
				if(amount >= denomination[denomination.length-i + 1]){
					changeArray[i] = amount/denomination[i];
					amount = amount - ((amount/denomination[i])*denomination[i]);
					i = i++;
				} 
				if(amount  >= denomination[denomination.length-2]){
					changeArray[i] = amount/denomination[i];
					amount = amount - ((amount/denomination[i])*denomination[i]);
					i = i++;
				}
			}
	
		//System.out.println("\nThe result is like this \n" + Arrays.toString(changeArray));		
	}



