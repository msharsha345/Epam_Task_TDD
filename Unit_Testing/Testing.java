package Unit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {
	ReverseOfLastTwoCharactersOfASting object=new ReverseOfLastTwoCharactersOfASting();
	@Test
	void testingStringWithZeroCharacter() 
	{
		assertEquals("",object.ReverseOfLastTwoCharacters(""),"Executed Successfully");
	}
	@Test
	void testingStringWithOneCharacter() 
	{
		assertEquals("c",object.ReverseOfLastTwoCharacters("c"),"Executed Successfully");
		assertEquals("v",object.ReverseOfLastTwoCharacters("v"),"Executed Successfully");
		assertEquals("h",object.ReverseOfLastTwoCharacters("h"),"Executed Successfully");
		assertEquals("r",object.ReverseOfLastTwoCharacters("r"),"Executed Successfully");
	}
	@Test
	void testingStringWithTwoCharacter() 
	{
		assertEquals("cv",object.ReverseOfLastTwoCharacters("vc"),"Executed Successfully");
		assertEquals("vh",object.ReverseOfLastTwoCharacters("hv"),"Executed Successfully");
		assertEquals("hr",object.ReverseOfLastTwoCharacters("rh"),"Executed Successfully");
		assertEquals("hc",object.ReverseOfLastTwoCharacters("ch"),"Executed Successfully");
	}
	@Test
	void testingStringWithFourCharacter() 
	{
		assertEquals("cvhr",object.ReverseOfLastTwoCharacters("cvrh"),"Executed Successfully");
		assertEquals("vhcr",object.ReverseOfLastTwoCharacters("vhrc"),"Executed Successfully");
		assertEquals("hrcv",object.ReverseOfLastTwoCharacters("hrvc"),"Executed Successfully");
		assertEquals("hcvh",object.ReverseOfLastTwoCharacters("hchv"),"Executed Successfully");
	}
	@Test
	void testingStringWithNCharacter() 
	{
		assertEquals("harshareddy",object.ReverseOfLastTwoCharacters("harsharedyd"),"Executed Successfully");
		assertEquals("vainavireddy",object.ReverseOfLastTwoCharacters("vainaviredyd"),"Executed Successfully");
		assertEquals("chetanakotgale",object.ReverseOfLastTwoCharacters("chetanakotgael"),"Executed Successfully");
		assertEquals("rajunaidu",object.ReverseOfLastTwoCharacters("rajunaiud"),"Executed Successfully");
	}
	
	
	
	
}
