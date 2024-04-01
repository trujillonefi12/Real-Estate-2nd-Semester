/**
* File: LAB 6I
* Description: WE HAD TO DO VARIOUS TYPES OF CLASSES AND EXTEND EACH ONE OF THEM ALSO CREATING VARIOPUS TEST CASES TO SEE IF 
* THE METHODS THAT WE CREATED WORKED
* Instructor's Name: BARBARA CHAMBERLAIN
*
* @author: NEFI J TRUJILLO
* @since: SUN FEB 23TH 2024
*/


package RealEstate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResidentialTest {

	@Test
	void testGetbedCount() {
		Residential c3 = new House("234 E Temple Sqr", 81102, 2, 1, 4.5, 2.3);

		int count = c3.getbedCount();

		assertEquals(count, 2);
	}

	@Test
	void testGetbathCount() {
		Residential c3 = new Condo("234 E Temple Sqr", 81102, 2, 1, 4.5, 1);

		int count = c3.getbathCount();

		assertEquals(count, 1);

	}

	@Test
	void testGetsqFootage() {
		Residential c3 = new House("234 E Temple Sqr", 81102, 2, 1, 4.5, 2.3);

		double count = c3.getsqFootage();

		assertEquals(count, 4.5);

	}

	@Test
	void testSetbedCountInt() {
		Residential c3 = new House("234 E Temple Sqr", 81102, 2, 1, 4.5, 2.4);
		
		c3.setbedCount(8);
		
		double count = c3.getbedCount();

		assertEquals(count, 8);
	}

	@Test
	void testSetbathCount() {
		Residential c3 = new House("234 E Temple Sqr", 81102, 2, 1, 4.5, 3.2);
		
		c3.setbathCount(4);
		
		double count = c3.getbathCount();

		assertEquals(count, 4);
	}

	@Test
	void testSetbedCount() {
		Residential c3 = new House("234 E Temple Sqr", 81102, 2, 1, 4.5, 3.2);
		
		c3.setbedCount(2);
		
		double count = c3.getbedCount();

		assertEquals(count, 2);
	}
	

}
