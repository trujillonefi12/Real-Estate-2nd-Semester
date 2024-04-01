/*WEEK 9 

LAB 91
 * 
 * BARBARA CHAMBERLAIN 
 * 
 * NEFI TRUJILLO
 * 
 * BUILDING AN INTRERFACE AND UTILIZING HASHMAPS 
 * 
 MARCH 9 2024
 */

package RealEstate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

//import java.util.Map;

public interface Listable {

    // methods
    // returns a hashmap containig a list of street address (key) and
    // its associated residence.
    public HashMap<String, Residential> getListings();

    // Takes a String argument and returns the Residential
    // value for the associated String key in a HashMap<String, Residential>

    public String getListing(String associatedKeyString);

    //Takes no arguments and returns a Set<String> of keys 
    //from a HashMap<String, Residential>

    public Set<String> getStreetAddresses();

    //Takes no arguments and returns a Collection<Residential> of values from
    // a HashMap<String, Residential>

    public Collection<Residential> getResdidences() ; 

    public  int getListingCount () ; 

    public void addListing (String i, Residential e);

}
