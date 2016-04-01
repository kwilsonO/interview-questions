import java.util.*;

//uppercase change 'a' to 'A'
//full Ascii use 256 for charSetSize

public class Prob1_2{

	public static void main(String[] Args){

		int charSetSize = 26;
		String str1 = "fubar";	
		String str2 = "xxfar";
	
		BitSet bits1 = new BitSet(charSetSize);
		BitSet bits2 = new BitSet(charSetSize);

			

		for(int x = 0; x < str1.length(); x++){
			bits1.set(str1.charAt(x) - 'a');
			bits2.set(str2.charAt(x) - 'a');
		}	

	//	System.out.println("Bitset1" + bits1);
	//	System.out.println("Bitset2" + bits2);

		bits1.xor(bits2);

	//	System.out.println("Bitset1" + bits1);
	//	System.out.println("Bitset2" + bits2);

		if(!bits1.isEmpty()){
			
			System.out.println("Not permutation");
		} else {

			System.out.println("Permutation");
		}

	}
}
