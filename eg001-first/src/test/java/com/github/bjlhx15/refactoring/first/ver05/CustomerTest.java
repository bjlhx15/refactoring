package com.github.bjlhx15.refactoring.first.ver05;

import org.junit.Test;

/**
 * @author lihongxu6
 * @version 1.0
 * @className CustomerTest
 * @description TODO
 * @date 2020-12-29 13:35
 */
public class CustomerTest {
    @Test
    public void statement() {
        Customer customer = new Customer("John");
        String title = "Titanic";
        int priceCode = 1;
        int _daysRented = 7;
        Movie movie = new Movie(title, priceCode);
        Rental rental = new Rental(movie, _daysRented);
        customer.addRental(rental);
        String result = customer.statement();
        System.out.println(result);
    }
}