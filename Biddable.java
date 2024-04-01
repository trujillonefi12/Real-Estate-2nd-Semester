package RealEstate;

import java.util.HashMap;
import java.util.Set;

public interface Biddable {

    // attributes - no attributes this time

    // getBids method
    // Takes no argument and returns a hashmap <string, double> containing a list
    // of bidder names (key) and their associated bid.
    public HashMap<String, Double> getBids();

    // Takes a String argument and returns
    // the Double value for the associated String key in a HashMap<String, Double>.
    public Double getBid(String a);

    // Takes no arguments and returns a Set<String> of keys from a
    // HashMap<String, Double>.
    public Set<String> getBidders();

    // Takes no arguments and returns the number of bids
    // in the HashMap<String, Double>.
    public int getBidcount();

    // newBid(String, Double): Returns void. Either updates the value
    // for the key or adds a new key/value pair in a HashMap<String, Double>.

    public void newBid(String n, Double l);

}
