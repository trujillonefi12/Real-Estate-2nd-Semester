/**
* File: WEEK 6
* Description: WE HAD TO DO VARIOUS TYPES OF CLASSES AND EXTEND EACH ONE OF THEM ALSO CREATING VARIOPUS TEST CASES TO SEE IF 
* THE METHODS THAT WE CREATED WORKED
* Instructor's Name: BARBARA CHAMBERLAIN
*
* @author: NEFI J TRUJILLO
* @since: SUN FEB 4TH 2024
*/

package RealEstate;

import java.util.HashMap;
import java.util.Set;

public class Condo extends Residential {// START OF THE CLASS CONDO
	// START OF THE ATTRIBUTES

	private int floorLvl;

	// START OF THE CONSTRUCTORS
	// CONSTRUCTOR NULL

	public Condo() { // START OF NULL CONSTRUCTOR

		floorLvl = 0;

	}// END OF THE NULL CONSTRUCOTR

	public Condo(String sA, int zi, int bC, int baC, double sqft, int lvl) { // START OF THE REAL CONSTRUCTOR
		super(sA, zi, bC, baC, sqft);
		floorLvl = lvl;

	}// END OF COSNTRUCTOR

	// START OF THE GETTER AND SETTER METHODS FOR floorLvl

	public int getfloorLvl() { // GETTTER METHOD STARRT

		return floorLvl;

	} // END OF THE GETTER METHOD

	public void setfloorLvl(int newlevel) {

		floorLvl = newlevel;
	} // END OF THE SETTER

	public double calculateAppraisalPrice() { // CALCULATE APPARISAL METHOD FOR THE CONDO

		double sqfCalc = 0.0;
		int bedroomCalc = 0;
		int bathCalc = 0;
		int levelsCalc = 0;

		sqfCalc = this.getsqFootage() * 88.00;

		bedroomCalc = this.getbedCount() * 8000;

		bathCalc = this.getbathCount() * 10000;

		if (this.getfloorLvl() > 2) {

			levelsCalc = (int) (this.getfloorLvl() * 5000);

		} else {

			levelsCalc = 5000;
		}

		return sqfCalc + bedroomCalc + bathCalc + levelsCalc;

	} // END OF THE CALCULATE APPRAISAL METHOD FOR CONDO

	private HashMap<String, Double> bids = new HashMap<>();

	// getBids method
	// Takes no argument and returns a hashmap <string, double> containing a list
	// of bidder names (key) and their associated bid.
	public HashMap<String, Double> getBids() {

		return bids;

	}

	// Takes a String argument and returns
	// the Double value for the associated String key in a HashMap<String, Double>.
	public Double getBid(String a) {

		if (bids.containsKey(a)) {
			return bids.get(a);
		} else {
			return null;
		}
	}

	// Takes no arguments and returns a Set<String> of keys from a
	// HashMap<String, Double>.
	public Set<String> getBidders() {

		return bids.keySet();

	}

	// Takes no arguments and returns the number of bids
	// in the HashMap<String, Double>.
	public int getBidcount() {
		return bids.size();
	}

	// newBid(String, Double): Returns void. Either updates the value
	// for the key or adds a new key/value pair in a HashMap<String, Double>.

	public void newBid(String n, Double l) {

		if (bids.containsKey(n)) {

			bids.put(n, l);

		} else {

			bids.put(n, l);
		}

	}

	public String toString() {

		String boy2 = String.format(
				"\n----------------------------------------------------------------------------------------------\n"
						+ //
						"Residence Type: Condo           Address: %s           Zip Code: %d\n" + //
						"----------------------------------------------------------------------------------------------\n"
						+ //
						"Sq Footage: %.2f\n" + //
						"Bedrooms: %d\n" + //
						"Bathrooms: %d\n" + //
						"Floor: %d\n" + //
						"----------------------------------------\n" + //
						"Appraisal Price: $%,.2f\n" + //
						"List Price: $%,.2f\n" + //
						"----------------------------------------\n",
				this.getstreetAddress(), this.getzip(), this.getsqFootage(), this.getbedCount(), this.getbathCount(),
				this.getfloorLvl(), this.calculateAppraisalPrice(), this.getListPrice());

		return boy2;

	}

} // end of the class