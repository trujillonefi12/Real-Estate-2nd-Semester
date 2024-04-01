/* NEFI TRUJILLO
 * BARBARA CHAMBERLAIN
 * 
 * CS115 
 * 
 * FINALL PROJECT
 * 
 * 
 */

package RealEstate;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Map.Entry;
//import java.util.Map;
import java.util.Scanner;

public class REO { // start of the REO class

	private static Listings listings = new Listings();
	public static HashMap<String, Residential> menuMap = new HashMap<>();

	public static void main(String[] args) { // start of the main method
		Scanner mIn = new Scanner(System.in);

		boolean done = false;

		while (!done) {

			// FORMAT STRINGS HEADINGS

			String mainmenu = " Main Menu ";
			System.out.println("\n----------------------------------------\n");
			System.out.printf("%25s", mainmenu);
			System.out.println("\n----------------------------------------\n");

			// END OF HEADINGS FORMATTING

			System.out.println("1: Listings");
			System.out.println("2: Bids");

			System.out.print("\nWhat would you like to do? (1-2) : ");
			String userChoice = " ";

			if (mIn.hasNextLine()) {
				userChoice = mIn.nextLine();
			}

			if (userChoice.equals(" ")) { // start of the if program for the choice to end

				done = true;

			} else {

				switch (userChoice) {

					case "1": // CASES FOR THE FIRST INTERFACE "LISTINGS"

						boolean done2 = false;

						while (!done2) { // start of done 2

							// FORMAT STRINGS HEADINGS

							String listingmenu = " Listing Menu ";
							System.out.println("\n----------------------------------------\n");
							System.out.printf("%25s", listingmenu);
							System.out.println("\n----------------------------------------\n");

							// END OF HEADINGS FORMATTING

							System.out.println("1: Add Listing");
							System.out.println("2: Show Listings");
							System.out.println("3: Auto Populate Listings");
							System.out.println("ENTER go to the previous menu");

							System.out.print("\nWhat would you like to do (1-3): ");
							String choiceInput = mIn.nextLine();

							if (choiceInput.equals("")) {
								done2 = true;
							}

							else {

								switch (choiceInput) {

									case "1": // SECOND LINE INHERITED CASE "ADD LISTING"
										boolean donev2c1 = false;

										while (!donev2c1) { // start of the while loop donev2c1

											// FORMAT STRINGS HEADINGS

											String addlistingmenu = " Add Listing Menu ";
											System.out.println("\n----------------------------------------\n");
											System.out.printf("%25s", addlistingmenu);
											System.out.println("\n----------------------------------------\n");

											// END OF HEADINGS FORMATTING

											System.out.println("1: Add House");
											System.out.println("2: Add Condo");
											System.out.println("ENTER go to the previous menu");

											System.out.print("\nWhat would you like to do (1-2): ");
											String userInputAddL = mIn.nextLine();

											if (userInputAddL.equals("")) {

												donev2c1 = true;

											} else {
												switch (userInputAddL) {

													case "1": // ADD HOUSE

														boolean housetoaddstop = false;

														while (!housetoaddstop) {

															int bath = 0;
															int Zip = 0;
															double sqft1 = (double) 0;
															int bed = 0;
															double acre = (double) 0;

															System.out.print("\nAddress : ");
															String houseAddress = mIn.nextLine();

															Zip = getValidInt(mIn, "\nZip code: ",
																	"Please enter a whole number");

															sqft1 = getValidDouble(mIn, "\nEnter square footage: ",
																	"Enter your square footage as number");

															bed = getValidInt(mIn, "\nEnter the amount of Bedrooms: ",
																	"Please enter a whole number");

															bath = getValidInt(mIn, "\nEnter the amount of Bathrooms: ",
																	"Please enter a whole number");

															acre = getValidDouble(mIn, "\nEnter the Yards (Acre): ",
																	"Enter a number of yards");

															Residential casa1 = new House(houseAddress, Zip, bed, bath,
																	sqft1, acre);

															double price = getValidDouble(mIn,
																	"\nEnter the list price: ",
																	"Plaese enter an amount in numbers");

															casa1.setListPrice(price);

															System.out.print(casa1.toString());

															boolean stop = false;

															do {
																System.out.print(
																		"Do you want to add more houses? (YES) (NO): ");
																String userWants = mIn.nextLine();

																if (userWants.equalsIgnoreCase("YES")) {

																	listings.addListing(houseAddress, casa1);

																	housetoaddstop = false;

																	break;

																} else if (userWants.equalsIgnoreCase("NO")) {

																	listings.addListing(houseAddress, casa1);

																	housetoaddstop = true;

																	stop = true;
																	break;

																} else {
																	System.out.println("Please type 'yes' or 'no'");

																	stop = false;

																}
															} while (!stop);

														}

														donev2c1 = true;

														break;

													case "2": // ADD CONDO CASE

														boolean housetoaddstop1 = false;

														while (!housetoaddstop1) {

															int bath = 0;
															int Zip = 0;
															double sqft1 = (double) 0;
															int bed = 0;
															int lvl = 0;

															System.out.print("\nAddress : ");
															String houseAddress = mIn.nextLine();

															Zip = getValidInt(mIn, "\nZip code :",
																	"Please enter a whole number");

															sqft1 = getValidDouble(mIn, "\nEnter the square footage: ",
																	"Please enter the square footage of your condo in numbers");

															bed = getValidInt(mIn, "Enter the amount of bedrooms",
																	"Please enter a whole number");

															bath = getValidInt(mIn, "\nEnter the amount of Bathrooms: ",
																	"Please enter a whole number");

															lvl = getValidInt(mIn, "\nEnter condo levels(floors): ",
																	"Please enter a whole number");

															double price = getValidDouble(mIn,
																	"\nEnter the list price: ",
																	"Plaese enter an amount in numbers");

															Residential casa2 = new Condo(houseAddress, Zip, bed, bath,
																	sqft1, lvl);

															casa2.setListPrice(price);

															System.out.println(casa2.toString());

															boolean stop = false;

															do {
																System.out.print(
																		"Do you want to add more Condos? (YES) (NO): ");
																String userWants = mIn.nextLine();

																if (userWants.equalsIgnoreCase("YES")) {

																	listings.addListing(houseAddress, casa2);

																	housetoaddstop1 = false;

																	break;

																} else if (userWants.equalsIgnoreCase("NO")) {

																	listings.addListing(houseAddress, casa2);

																	housetoaddstop1 = true;

																	stop = true;

																	break;

																} else {
																	System.out.println("Please type 'yes' or 'no'");

																	break;
																}
															} while (!stop);

														}

														donev2c1 = true;

														break;

												}// end of the third switch inside the second switch
											} // end of the if statement inside the 3rd switch case "add listing"

										} // end of donev2c1 while loop
										break;
									case "2": // SECOND INHERITED CASE 2 "SHOW LISTINGS"

										System.out.println(listings.toString());

										break;
									case "3": // SECOND INHERITED CASE 2 "AUTO POPULATE LISTINGS"

										autoPopulateListing();

										break;

								}// end of the second switch statement inside done2

							} // second if for the boolean done2

						} // end of done 2

						break;

					case "2": // CASE FOR FIRST FATHER CASE SCENARIO "BID"

						boolean done3 = false;

						while (!done3) { // start of done 2

							// FORMAT STRINGS HEADINGS

							String bidmenu = " Bids Menu ";
							System.out.println("\n----------------------------------------\n");
							System.out.printf("%25s", bidmenu);
							System.out.println("\n----------------------------------------\n");

							// END OF HEADINGS FORMATTING

							System.out.println("1: Add new Bid");
							System.out.println("2: Show existing Bids");
							System.out.println("3: Auto Populate Bids");
							System.out.println("ENTER go to the previous menu");

							System.out.print("\nWhat would you like to do (1-3): ");
							String choiceInput2 = mIn.nextLine();

							if (choiceInput2.equals("")) {
								done3 = true;
							}

							else {

								switch (choiceInput2) {

									case "1": // SECOND LINE INHERITED CASE "ADD NEW BID"
										boolean marco = false;
										while (!marco) {
											int ccmd = 1;

											System.out.printf(
													"Current listings for REO: \n",
													" No.   Property(Bids)\n----------------------------");

											for (Residential a : listings.getResdidences()) {

												System.out.printf("%d: %s (%d)\n", ccmd, a.getstreetAddress(),
														a.getBidcount());

												menuMap.put(Integer.toString(ccmd), a);

												ccmd++;

											}

											System.out.println("\nENTER to go back\n");

											System.out.print("Which Property add bid? : ");

											String choicebid = mIn.nextLine();

											if (choicebid.isEmpty()) {
												marco = true;

											} else {

												System.out.println(menuMap.get(choicebid));
												// HashMap <String, Double> allbids = new HashMap<>();
												Residential b = menuMap.get(choicebid);

												System.out.print("Enter the name of the bidder: ");
												String bidderName = mIn.nextLine();

												System.out.print("Enter the new bid: ");
												String bidamount = mIn.nextLine();
												Double bids = Double.parseDouble(bidamount);

												b.newBid(bidderName, bids);

												System.out.println(
														"New bid for property ' " + b.getstreetAddress()
																+ " ' added\n\n");

											}

										}

										break;
									case "2": // SECOND LINE INHERITED CASE "SHOW EXISTING BIDS"

										getListings(mIn);

										break;
									case "3": // SECOND LINE INHERITED CASE "AUTO POPULATE BIDS"

										autoPopulateBids();

										break;

								}// end of the third switch statement inside done2

							} // third if for the boolean done2

						} // end of done 2

						break;

					default:

						System.out.println("Invalid response:  Please enter a choice from the menu (1-2)");

						break;
				} // end of the s

			} // end of the if blank end program

		} // end of the cases " while " done

		mIn.close();
	}// end of the main method

	public static void getListings(Scanner mIn) { // start of the method

		boolean marco = false;

		while (!marco) {
			int ccmd = 1;

			System.out.printf(
					"\nCurrent listings for REO: \n",
					" No.   Property(Bids)\n----------------------------");

			for (Residential a : listings.getResdidences()) {

				System.out.printf("%d: %s (%d)\n", ccmd, a.getstreetAddress(),
						a.getBidcount());

				menuMap.put(Integer.toString(ccmd), a);

				ccmd++;

			}

			System.out.println("\nENTER to go back\n");

			System.out.print("Which Property would you like to see? : ");

			String choicebid = mIn.nextLine();

			if (choicebid.isEmpty()) {
				marco = true;

			} else {

				System.out.println(menuMap.get(choicebid));

				Residential b = menuMap.get(choicebid);
				System.out.printf(
						"Current bids for the listings: \n---------------------------------- \nBidder			Bid\n----------------------------------\n");

				for (Entry<String, Double> entry : b.getBids().entrySet()) {
					String bidder = entry.getKey();
					Double bidAmount = entry.getValue();

					System.out.printf("\n%-20s $%,.2f\n", bidder, bidAmount);

				}

			}
		}

	} // end of the getlistings method

	public static void autoPopulateBids() {

		// Hard Coded set of names to be used as bidders

		String[] autoBidders = { "Patric Stewart", "Walter Koenig", "William Shatner", "Leonard Nimoy",
				"DeForect Kelley", "James Doohan", "George Takei", "Majel Barrett", "Nichelle Nichol", "Jonathan Frank",
				"Marina Sirtis", "Brent Spiner", "Gates McFadden", "Michael Dorn", "LeVar Burton", "Wil Wheaton",
				"Colm Meaney", "Michelle Forbes" };

		// Create an object of type Random, r

		Random r = new Random();

		// Randomly select a number between 0 and the length of the autoBidders list -
		// 1. This will be your random index into the array.

		// int index = r.nextInt((autoBidders.length - 1) + 1);

		for (Residential man : listings.getResdidences()) {
			int maxBid = (int) (man.calculateAppraisalPrice() * 1.1);
			int minBid = (int) (man.calculateAppraisalPrice() * 0.9);

			// Randomly select the number of bids for this residential
			int numberOfBids = r.nextInt(8) + 2; // Random number of bids between 2 and 9
			int marc = 0; // Initialize the counter for bids

			while (marc < numberOfBids) {
				int index = r.nextInt(autoBidders.length);
				int bidAmount = r.nextInt(maxBid - minBid + 1) + minBid;
				man.newBid(autoBidders[index], (double) bidAmount);
				marc++; // Increment the counter after each bid
			}

			System.out.println(numberOfBids + " new bids have been added to listing '" + man.getstreetAddress() + "'");
		}

		// Create a random bid amount between -10% and +10% of the Appraisal Price

		// Use the random index number to select a random bidder and use the randomly
		// generated bid amount to create a new bid.

	} // end of the autop bids method

	public static void autoPopulateListing() {
		House house1 = new House("34 Elm", 95129, 3, 2, 2200, .2);
		house1.setListPrice(house1.calculateAppraisalPrice() * 1.1);
		listings.addListing("34 Elm", house1);
		House house2 = new House("42 Hitchhikers", 95136, 4, 3, 2800, .3);
		house2.setListPrice(house2.calculateAppraisalPrice() * 1.1);
		listings.addListing("42 Hitchhikers", house2);
		Condo condo1 = new Condo("4876 Industrial", 95177, 3, 1, 1800, 3);
		condo1.setListPrice(condo1.calculateAppraisalPrice() * 1.1);
		listings.addListing("4876 Industrial", condo1);
		House house3 = new House("2654 Oak", 84062, 5, 53, 4200, .5);
		house3.setListPrice(house3.calculateAppraisalPrice() * 1.1);
		listings.addListing("2654 Oak", house3);
		Condo condo2 = new Condo("9875 Lexington", 84063, 2, 1, 1500, 1);
		condo2.setListPrice(condo2.calculateAppraisalPrice() * 1.1);
		listings.addListing("9875 Lexington", condo2);
		Condo condo3 = new Condo("3782 Market", 84066, 3, 1, 1800, 2);
		condo3.setListPrice(condo3.calculateAppraisalPrice() * 1.1);
		listings.addListing("3782 Market", condo3);
		House house4 = new House("7608 Glenwood", 84055, 6, 3, 3900, .4);
		house4.setListPrice(house4.calculateAppraisalPrice() * 1.1);
		listings.addListing("7608 Glenwood", house4);
		House house5 = new House("1220 Apple", 84057, 8, 7, 7900, 1);
		house5.setListPrice(house5.calculateAppraisalPrice() * 1.1);
		listings.addListing("1220 Apple", house5);
		int currentSize = listings.getListings().size();

		System.out.println(currentSize + " Had been added to the listings");

	}

	public static int getValidInt(Scanner sIn, String question, String warning) {
		String input; // Users input
		int intNum = 0; // The integer var to hold the converted input
		boolean validAnswer = false; // do-while loop control

		// Keep asking question until the user enters valid input.
		do {
			System.out.print(question);
			input = sIn.nextLine();
			try {
				intNum = Integer.parseInt(input);
				return intNum; // If the input is a valid integer, return it.
			} // end of try to convert input to int
			catch (NumberFormatException e) {
				System.out.println(warning); // If the input is not a valid integer, print warning and repeat.
			} // end of catch
		} while (!validAnswer);
		return intNum;
	}// end of method getValidInt(Scanner, String, String)

	public static Double getValidDouble(Scanner sIn, String question, String warning) {
		String input; // Users input
		double Num = (double) 0; // The integer var to hold the converted input
		boolean validAnswer = false; // do-while loop control

		// Keep asking question until the user enters valid input.
		do {
			System.out.print(question);
			input = sIn.nextLine();
			try {
				Num = Double.parseDouble(input);
				return Num; // If the input is a valid integer, return it.
			} // end of try to convert input to int
			catch (NumberFormatException e) {
				System.out.println(warning); // If the input is not a valid integer, print warning and repeat.
			} // end of catch
		} while (!validAnswer);
		return Num;
	}// end of method getValidInt(Scanner, String, String)

}// end of the public class

/*
 * String[] autoBidders = { "Patric Stewart", "Walter Koenig",
 * "William Shatner", "Leonard Nimoy",
 * "DeForest Kelley", "James Doohan", "George Takei", "Majel Barrett",
 * "Nichelle Nichols", "Jonathan Frakes",
 * "Marina Sirtis", "Brent Spiner", "Gates McFadden", "Michael Dorn",
 * "LeVar Burton", "Wil Wheaton",
 * "Colm Meaney", "Michelle Forbes" };
 * 
 * Random r = new Random();
 * 
 * for (Residential man : listings.getResidences()) {
 * int maxBid = (int) (man.calculateAppraisalPrice() * 1.1);
 * int minBid = (int) (man.calculateAppraisalPrice() * 0.9);
 * 
 * // Randomly select the number of bids for this residential
 * int numberOfBids = r.nextInt(5) + 1; // Adjust the range as needed
 * 
 * for (int i = 0; i < numberOfBids; i++) {
 * int index = r.nextInt(autoBidders.length);
 * int bidAmount = r.nextInt(maxBid - minBid + 1) + minBid;
 * man.newBid(autoBidders[index], (double) bidAmount);
 * }
 * 
 * System.out.println(numberOfBids + " new bids have been added to listing '" +
 * man.getStreetAddress() + "'");
 * }
 * 
 */