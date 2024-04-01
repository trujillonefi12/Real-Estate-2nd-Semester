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

class PropertyTest {

	@Test
	void testGetstreetAddress() {
		Property coca = new House("734 East Temple", 84106, 1, 23, 2, 4);

		String count = coca.getstreetAddress();

		assertEquals(count, "734 East Temple");
	}

	@Test
	void testGetzip() {
		Property coca = new House("734 East Temple", 84106, 1, 23, 2, 4);

		int count = coca.getzip();

		assertEquals(count, 84106);
	}

	@Test
	void testSetstreetAddress() {
		Property coca = new Condo("734 East Temple", 84106, 2, 2, 21.1, 3);

		coca.setstreetAddress("425 Backyard east");

		String count = coca.getstreetAddress();

		assertEquals(count, "425 Backyard east");
	}

	@Test
	void testSetzip() {
		Property coca = new Condo("734 East Temple", 84106, 2, 2, 21.1, 3);

		coca.setzip(5555);

		int count = coca.getzip();

		assertEquals(count, 5555);
	}
	
	@Test
	public void testGetAppraisalPrice() {
		
		Property coca = new Condo("734 East Temple", 84106, 2, 2, 21.1, 3);

		double count =  coca.calculateAppraisalPrice();

		assertEquals(count, 52856.8);
    }
	
	@Test
	public void testsetAppraisalPrice() {
		
		Property coca = new Condo("734 East Temple", 84106, 2, 2, 21.1, 3);
		
		coca.setAppraisalPrice(54000);

		double count =  coca.getApraisalPrice();

		assertEquals(count, 54000);
    }



}
