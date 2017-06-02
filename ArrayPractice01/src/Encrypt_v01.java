
public class Encrypt_v01 
{
	public static void main(String[] args)
	{
		int size = 26;
		char[] alphabet = new char[size];
		alphabet[0] = 'A';
		alphabet[1] = 'B';
		alphabet[2] = 'C';
		alphabet[3] = 'D';
		alphabet[4] = 'E';
		alphabet[5] = 'F';
		alphabet[6] = 'G';
		alphabet[7] = 'H';
		alphabet[8] = 'I';
		alphabet[9] = 'J';
		alphabet[10] = 'K';
		alphabet[11] = 'L';
		alphabet[12] = 'M';
		alphabet[13] = 'N';
		alphabet[14] = 'O';
		alphabet[15] = 'P';
		alphabet[16] = 'Q';
		alphabet[17] = 'R';
		alphabet[18] = 'S';
		alphabet[19] = 'T';
		alphabet[20] = 'U';
		alphabet[21] = 'V';
		alphabet[22] = 'W';
		alphabet[23] = 'X';
		alphabet[24] = 'Y';
		alphabet[25] = 'Z';
		
		String input = "NORTH KOREAZ";
		String output = "";
		int shift = 2;
		int searchCharIndex;
		int shiftCharIndex;
		int fixedCharIndex;
		// If shift = 1,
		// char = 'Z', shiftChar = 'A'
		// char = 'Z', shiftChar = 'A'
		
		// If shift = 2,
		// char = 'Z', shiftChar = 'B'
		// char = 'Y', shiftChar = 'A'
		
		// If shift = 24,
		// char = 'A', shiftChar = 'B'
		// char = 'Y', shiftChar = 'A'
		
		
		// If we mod the (charIndex + shift) % 26 
		
//		for (int i = 0; i < input.length(); i++) 
//		{
//			System.out.println("iteration number: " + (i+1));
//		} i gets destroyed
		System.out.println();
		for(int i = 0; i < alphabet.length; i++)
		{
			//System.out.println("iteration number: " + (i+1));
		}
		
		// Outer loop will iterate over the input
		// For every character in input, do the inner loop
		// A B C D E F G H I J K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 
		for(int i = 0; i < input.length(); i++)
		{
			// This inner loop searches for alphabet array for the character
			// in input
			for( int j = 0; j < alphabet.length; j++)
			{
				if(input.charAt(i) == alphabet[j])
				{
					System.out.println(input.charAt(i) + " is at index " + j);
					searchCharIndex = j;
					shiftCharIndex = j + shift;
					// before mod
					System.out.println("The broken index is " + shiftCharIndex);
					// after mod
					fixedCharIndex = shiftCharIndex % 26; // now this can only be 0 through 25
					System.out.println("The fixed index after moding is " + fixedCharIndex);
					System.out.println("The encrypted char is " + alphabet[fixedCharIndex]);
					
					// this line accumulates all the encrypted characters into an output string
					output = output + alphabet[fixedCharIndex];
					System.out.println(); // this makes a blank line
				}// end of if statement
			}// end of inner loop
		}// end of outer loop
		
		System.out.println("The encrypted string is " + output);
		
		
		
		
		

		
		/*for (int i = 0; i < input.length(); i++)
		{
			for (int j = 0; j < alphabet.length; j++)
			{
				if (alphabet[j] == input.charAt(i))
				{
					System.out.println(input.charAt(i) + " is at index " + j);
					System.out.println(input.charAt(i) + " shifted by 1 is " + alphabet[j + shift]);
					output += alphabet [j + shift];
				}
			}
		}
		System.out.println("The encrypted string is " + output);
		 */
		
	}

}
