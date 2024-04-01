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

//import DessertShop.IceCream;

class CondoTest {

	@Test
	void testGetfloorLvl() {
		Condo coca = new Condo("734 East Temple", 84106, 4, 3, 7.7, 2);

		int count = (int) coca.getfloorLvl();

		assertEquals(count, 2);
	}

	@Test
	void testSetfloorLvl() {
		Condo coca = new Condo("734 East Temple", 84106, 4, 3, 7.7, 2);

		coca.setfloorLvl(4);

		int count = (int) coca.getfloorLvl();

		assertEquals(count, 4);
	}

	@Test
	void testcalculateAppraisalPrice() {

		Condo coca = new Condo("734 East Temple", 84106, 4, 3, 7.7, 2);

		double count = coca.calculateAppraisalPrice();

		assertEquals(count, 67677.6);
	}

}
