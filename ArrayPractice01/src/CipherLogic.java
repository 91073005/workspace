
public class CipherLogic 
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
		
		String input = "FIZZ BUZZ";
		String output = "";
		int shift = 2;
		for (int i = 0; i < alphabet.length; i++)
		{
			System.out.print(alphabet[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < input.length(); i++)
		{
			System.out.print(input.charAt(i));
		}
		for (int i = 0; i < input.length(); i++)
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
		
	}
}
