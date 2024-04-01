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

abstract class Property { // START OD PROPERTY CLASS

	// START OF THE ATTRIBUTES

	private String streetAddress;
	private int zip;
	private double listPrice;
	private double appraisalPrice;

	// START OF THE CONSTRUCTORS
	// NULL CONSTRUCTOR

	public Property() {

		streetAddress = "";

		zip = 0;

		listPrice = 0.0;

		appraisalPrice = 0.0;

	} // END OF THE NULL CONSTRUCOTRS

	// START OF THE REAL CONSTRUCTORS

	public Property(String sA, int zi) {

		streetAddress = sA;

		zip = zi;

	} // END OF THE CONSTRUCTORS

	// START O F T H E METHODS

	public String getstreetAddress() { // GETTER FOR THE ADDRESS

		return streetAddress;

	} // END OF THE GETTER METHOD

	public int getzip() { // START OF THE GET ZIP METHOD

		return zip;
	}// END OF THE ZIP METHOD

	public void setstreetAddress(String newAd) { // START OF THE SETTER METHOD

		streetAddress = newAd;

	}// END OF THE SETTER METHOD

	public void setzip(int newzip) { // START OF THE SETTER METHOD FOR ZIP

		zip = newzip;
	}// END OF ZIP SETTER METHOD

	public double getListPrice() { // START OF THE GETTER METHOD FOR GETLIST PRICE

		return listPrice;

	} // END OF THE GET LIST METHOD

	public void setListPrice(double listPrice) { // start of the setter method for listing price

		this.listPrice = listPrice;

	}// END OF THE SEETER METHOD FOR LISTING PRICE

	public double getApraisalPrice() { // START OF THE GETAPPRAQISAL METHIOD

		return appraisalPrice;

	} // END OF THE THE GET APPRAISAL MEHTOF
	
	protected void setAppraisalPrice(double newprice) {
	
	appraisalPrice = newprice ; } // END OF THE PROTECTED METHOD

	
	public abstract double calculateAppraisalPrice() ; 
	
	
}/// END OF PROPERTY CLASS
