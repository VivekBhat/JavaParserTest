/**
 * 
 */
package algorithms_hw;


/**
 * @author Krishna
 *
 */
public class PracticeProgram {

	public static void main(String[] args ){
		System.out.println("hello world!");
		int a = 4;
		String nameType = "number";
		if( a < 5 && !nameType.isEmpty()) {
			System.out.println("Less than 5");
		} else{
			System.out.println("Greater than 5");
		}
	}
	
	public static void printNums(){
		int sample = 4;
		if( sample == 0){
			System.out.println(" zero samples ");
		} else if ( sample > 0 && sample < 5){
			System.out.println(" between 0 and 5 open interval (0,5)");
		}
		for(int i = 0 ; i <10; i++){
			System.out.println("Number " + i);
		} 
	}
	
	

}

