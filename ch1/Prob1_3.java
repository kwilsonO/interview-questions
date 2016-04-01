import java.util.*;
public class Prob1_3{

	public static void main(String Args[]){

		String myStr = "Mr John Smith    ";
	
		int trueLength = myStr.length();
	
		//DEM MAGIC NUMBERS BIZNATCH
		char[] ray = new char[trueLength + 12];

		int curPlace = ray.length - 1;

		for(int x = trueLength - 1; x > -1; x--){

			if(myStr.charAt(x) != ' '){
				ray[curPlace] = myStr.charAt(x);
				curPlace--;
			} else {
				ray[curPlace] = '0';
				ray[curPlace - 1] = '2';
				ray[curPlace - 2] = '%';	
				curPlace -= 3;
			}
		}


		System.out.println(Arrays.toString(ray));
		

	}
		
}
