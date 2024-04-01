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

class HouseTest {

	@Test
	void testGetyardAcres() {
		House coca = new House("734 East Temple", 84106, 4, 3, 7.7, 2);

		double count = coca.getyardAcres();

		assertEquals(count, 2);
	}

	@Test
	void testSetyardAcres() {
		House coca = new House("734 East Temple", 84106, 4, 3, 7.7, 2);

		coca.setyardAcres(4.5);

		double count = coca.getyardAcres();

		assertEquals(count, 4.5);
	}

	@Test
	void testcalculateAppraisalPrice() {

		House coca = new House("734 East Temple", 84106, 4, 3, 7.7, 2);

		double count = coca.calculateAppraisalPrice();

		assertEquals(count, 996746.9);
	}

}
