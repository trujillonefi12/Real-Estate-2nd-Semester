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

import java.util.HashMap;
import java.util.Set;

//import java.util.Scanner;
//import RealEstate.Listings;

public class House extends Residential { // START OF THE HOUSE CLASS
	// START OF THE ATTRIBUTES

	private double yardAcres;

	// START OF THE CONSTRUCTORS
	// CONSTRUCTOR NULL

	public House() { // START OF NULL CONSTRUCTOR

		yardAcres = (double) 0;

	}// END OF THE NULL CONSTRUCOTR

	public House(String sA, int zi, int bC, int baC, double sqft, double yAcr) { // START OF THE REAL CONSTRUCTOR
		super(sA, zi, bC, baC, sqft);
		yardAcres = yAcr;

	}// END OF COSNTRUCTOR

	// START OF THE GETTER AND SETTER METHODS FOR YARDAACRES

	public double getyardAcres() { // GETTTER METHOD STARRT

		return yardAcres;

	} // END OF THE GETTER METHOD

	public void setyardAcres(double newvalue) {

		yardAcres = newvalue;
	} // END OF THE SETTER

	public double calculateAppraisalPrice() {

		double sqfCalc = 0.0;
		int bedroomCalc = 0;
		int bathCalc = 0;
		double acreCalc = 0.0;

		sqfCalc = this.getsqFootage() * 97.00;

		bedroomCalc = this.getbedCount() * 10000;

		bathCalc = this.getbathCount() * 12000;

		acreCalc = this.getyardAcres() * 460000;

		return sqfCalc + bedroomCalc + bathCalc + acreCalc;

	}

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

		String boy = String.format(
				"\n----------------------------------------------------------------------------------------------\n"
						+ //
						"Residence Type: House          Address: %s           Zip Code: %d\n" + //
						"----------------------------------------------------------------------------------------------\n"
						+ //
						"Sq Footage: %.2f\n" + //
						"Bedrooms: %d\n" + //
						"Bathrooms: %d\n" + //
						"Yard Size (Acres): %.2f\n" + //
						"------------------------------------------\n" + //
						"Appraisal Price: $%,.2f\n" + //
						"List Price: $%,.2f\n" + //
						"------------------------------------------\n\n",
				this.getstreetAddress(), this.getzip(), this.getsqFootage(), this.getbedCount(), this.getbathCount(),
				this.getyardAcres(), this.calculateAppraisalPrice(), this.getListPrice());

		return boy;

	}

} // END OF THE HOUSE CLASS
