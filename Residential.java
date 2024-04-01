/**
* File: LAB 4I
* Description: WE HAD TO DO VARIOUS TYPES OF CLASSES AND EXTEND EACH ONE OF THEM ALSO CREATING VARIOPUS TEST CASES TO SEE IF 
* THE METHODS THAT WE CREATED WORKED
* Instructor's Name: BARBARA CHAMBERLAIN
*
* @author: NEFI J TRUJILLO
* @since: SUN FEB 4TH 2024
*/

package RealEstate;

//import java.util.HashMap;

public abstract class Residential extends Property implements Biddable {// START OF RESIDENTIAL CLASS

	// START OF THE ATTRIBUTES

	private int bedCount;

	private int bathCount;

	private double sqFootage;

	// END OF THE ATTRIBUTES

	// START OF THE CONSTRUCTORS
	// START PF NULL CONSTRUCTORS

	public Residential() { // START OF THE NULL CONSTRUCOTR

		bedCount = 0;
		bathCount = 0;
		sqFootage = 0;

	} // END OF THE NULL CONTRUCTOR

	public Residential(String sA, int zi, int bC, int baC, double sqft) { // START OF THE REAL CONSTRUCTORS
		super(sA, zi);
		bedCount = bC;
		bathCount = baC;
		sqFootage = sqft;

	} // END OF THE REAL CONSTRUCTORS

	// START OF THE METHODS

	public int getbedCount() { // GETTTER METHOD FOR BEDCOUNT STARRT

		return bedCount;

	} // END OF THE GETTER bedCount METHOD

	public int getbathCount() { // GETTTER METHOD FOR BathCOUNT STARRT

		return bathCount;

	} // END OF THE GETTER BATHCount METHOD

	public double getsqFootage() { // GETTTER METHOD FOR sqFOOTAGE STAR

		return sqFootage;

	} // END OF THE GETTER SQFOOTAGE METHOD

	// START OF THE SETTER METHODS

	public void setbedCount(int newbedCT) { // START OF THE SETTER METHOD FOR BEDCOUNT

		bedCount = newbedCT;
	}// END OF BEDCOUNT SETTER METHOD

	public void setbathCount(int newbathCT) { // START OF THE SETTER METHOD FOR

		bathCount = newbathCT;
	}// END OF BATHCOUNT SETTER METHOD

	public void setsqFootage(double newsqft) { // START OF THE SETTER METHOD FOR SQUARE FOOTAGE

		sqFootage = newsqft;

	}// END OF SQUARE FOOTAGE METHOD SETTER METHOD

	public abstract double calculateAppraisalPrice();

	// store the bids

}// END OF RESIDENTIAL CLASS
