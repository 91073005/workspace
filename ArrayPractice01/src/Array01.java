
public class Array01 
{
public static void main(String[] args) 
	{
	int topScore1 = 110;
	int topScore2 = 100;
	int topScore3 = 99;
	float topScore4 = 88.5f;
	int topScore5 = 88;
	int topScore6 = 87;
	int topScore7 = 86;
	int topScore8 = 85;
	int topScore9 = 84;
	int topScore10 = 83;
	int topScore11 = 82;
	int topScore12 = 81;
	int topScore13 = 80;
	
	// this is how you declare an array of type int
	int [] myIntArray;
	// here we create 100 elements in memory for myIntArray
	myIntArray = new int[100];
	
	// arrays are indexed in a zero-based fashion . . . we start counting at 0
	myIntArray[0] = 110; // this is the first element in the array
	myIntArray[1] = 100;
	myIntArray[2] = 99;
	myIntArray[3] = 89;
	myIntArray[4] = 88;
	myIntArray[5] = 87;
	myIntArray[6] = 86;
	
	for(int i = 100; i > 0; i--)
	{
		myIntArray[i] = i;
	}
	
	
	// declare a string array, float array, and a double array
	String [] myStringArray;
	float [] myFloatArr;
	double [] myDoubleArr;
	
	}
}
