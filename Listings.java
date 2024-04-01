package RealEstate;

import java.util.Collection;
import java.util.HashMap;
//import java.util.Map;
//import java.util.Map;
import java.util.Set;
//import java.util.Map.Entry;

//import packageName.Listings; // Replace "packageName" with the actual package name where Listings is located

public class Listings implements Listable {

    // attributes

    private HashMap<String, Residential> allListings;

    // default constructor

    public Listings() {

        allListings = new HashMap<>();
    }

    // inherited methods

    // methods
    // returns a hashmap containig a list of street address (key) and
    // its associated residence.
    public HashMap<String, Residential> getListings() {

        return allListings;

    }
    // Takes a String argument and returns the Residential
    // value for the associated String key in a HashMap<String, Residential>

    public String getListing(String associatedKeyString) {

        if (allListings.containsKey(associatedKeyString)) {

            return associatedKeyString;

        } else {
            return null;
        }

    }

    // Takes no arguments and returns a Set<String> of keys
    // from a HashMap<String, Residential>

    public Set<String> getStreetAddresses() {

        return allListings.keySet();
    }

    // Takes no arguments and returns a Collection<Residential> of values from
    // a HashMap<String, Residential>

    public Collection<Residential> getResdidences() {

        return allListings.values();
    }

    public int getListingCount() {

        return allListings.size();
    }

    public void addListing(String i, Residential e) {

        allListings.put(i, e);
    }

    public String toString() {
        String line = " ";
        int i = 1;
        String lin = " ";

        for (Residential key : getResdidences()) {

            line += "\nListing No: " + i + "\n" + key + "\n";

            i++;

        }

        return lin + line;
    }

}
