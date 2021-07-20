import java.util.Scanner;
import java.util.Random;
public class friend
{
public static void main(String[] args)
{

int[] friendsAge = new int[9];
// invoke the module for population

populateArray(friendsAge);

// call an concatinating method
String infoFriends = asString(friendsAge);
System.out.println("The age information for all memenbers: "+" "+infoFriends);

// calculate the average 
double aveCalc = average(friendsAge);
System.out.println("the calculated average is: "+" "+aveCalc);

// call module for number of averages

int numFriends  =  aboveAverage(friendsAge,aveCalc);
System.out.println("number of friends ages above the average:" + numFriends );



}

public static void populateArray(int[] pArray)
{
	Random rand  = new Random();
	int max = 40;
	int min = 20;
	
	for (int x=0;x<pArray.length;x++)
	{
		int generated  = rand.nextInt(max - min + 1)+min;
		
		pArray[x] = generated;
	}
	
}

public static String asString(int[] pArray2)
{
	String strValue= "";
	int number = 1234;
	
	for(int x=0;x<pArray2.length;x++)
	{
		strValue +="\n" + x + "\t" + pArray2[x]+"\t"+number;
	}
	
	return strValue;
}


public static double average(int[] pArray3)
{
     int count = 0;
     int tot = 0;
     
	 for(int x=0;x<pArray3.length;x++)
	 {
		 count++;
		 tot+=pArray3[x];
	 }
      double ave = tot/count;

   return ave;
   	 
}

public static int aboveAverage(int[] pArray4, double aveNum)
{
    int count = 0;
    for(int x=0;x<pArray4.length;x++)
	{
		if(pArray4[x] > aveNum)
		{
			count++;
		}
		
	}		

   return count;
}






}














