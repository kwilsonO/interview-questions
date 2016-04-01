import java.util.*;
public class Prob1_5{

	public static void main(String Args[]){
		
		int x = 0,y = 0;
		int diff = 0;
		String str1 = "pale";
		String str2 = "pleo";
	

		while(x < str1.length() && y < str2.length()){

			if(str1.charAt(x) == str2.charAt(y)){
				x++;
				y++;
				continue;
			} else if(str1.charAt(x + 1) == str2.charAt(y)){
				diff++;
				x+=2;
				y++;
				continue;
			} else {
				diff++;
				x++;
				y++;
			}

		}

		diff+= (x - (str1.length() - 1)) + (y - (str2.length() -1));

	
		System.out.println("Diff: " + diff);
	}


}
