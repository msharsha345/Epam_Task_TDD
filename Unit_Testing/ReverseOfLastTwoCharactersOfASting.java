package Unit_Testing;

public class ReverseOfLastTwoCharactersOfASting {
	public String ReverseOfLastTwoCharacters(String string)
	{
		int len=string.length();
		if(len<2)
			return string;	//if the string length is less than or equal to one then returing the string as it as with out any change
		else
		{
		char temp1,temp2; //creating two temporary characters temp1 and temp2
		temp1=string.charAt(len-2); //Assigning last but one character to temp1
		temp2=string.charAt(len-1); //Assigning last character to temp2
		string=string.substring(0, len-2)+temp2+temp1;//concating the string and storing in the string
		return string;
		}
	}

}
