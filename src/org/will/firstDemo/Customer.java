package org.will.firstDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName:Customer
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月26日
 */
public class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        this.rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        StringBuffer result = new StringBuffer("Rental Record for ")
                .append(getName())
                .append("\n");
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Iterator<Rental> rentalIterator = rentals.iterator();

        while (rentalIterator.hasNext()) {
            Rental rental = rentalIterator.next();

            double thisAmount = rental.getCharge();

            frequentRenterPoints += rental.getFrequentRenterPoints();
            result.append("\t")
                    .append(rental.getMovie().getTitle())
                    .append("\t")
                    .append(thisAmount)
                    .append("\n");
            totalAmount += thisAmount;
        }
        result.append("Amount owed is ")
                .append(totalAmount)
                .append("\n")
                .append("You earned ")
                .append(frequentRenterPoints)
                .append(" frequent renter points");
        return result.toString();
    }


}
