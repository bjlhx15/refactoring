package com.github.bjlhx15.refactoring.first.ver05;

/**
 * @author lihongxu6
 * @version 1.0
 * @className RegularPrice
 * @description TODO
 * @date 2020-12-29 13:35
 */
public class RegularPrice extends Price {
    int getPriceCode() {
        return Movie.REGULAR;
    }

    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 1.5;
        return result;
    }
}
