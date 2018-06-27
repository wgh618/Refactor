package org.will.firstDemo;

/**
 * ClassName:Test
 * Description:
 *
 * @author Will Wu
 * @email willwu618@gmail.com
 * @date 2018年06月26日
 */
public class Test {
    public static void main(String[] args) {
        Movie movie = new Movie("AAA", 2);
        Rental rental = new Rental(movie, 3);
        Customer customer = new Customer("Jack");
        customer.addRental(rental);
        System.out.println(customer.statement());
    }
}
