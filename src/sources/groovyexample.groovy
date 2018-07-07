import java.util.Date;

@Test
void testToUpperCase()
{
	// Use a Java class
	Date date = new Date()
	System.out.println("Todays date is ${date}")
	// Create a collection of strings
	def list = [ "entry1", "entry2", "entry3" ]
	// Puts every entry into uppercase and returns a new list
	def uCaseList = list.collect {
		it.toUpperCase()
	}
	// Print each entry
	uCaseList.each {
		System.out.println("My entry is: ${it}")
	}
	// Compare list
	assert uCaseList == ["ENTRY1", "ENTRY2", "ENTRY3"]
}