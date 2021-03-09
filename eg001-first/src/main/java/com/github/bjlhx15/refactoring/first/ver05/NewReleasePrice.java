package com.github.bjlhx15.refactoring.first.ver05;

/**
 * @author lihongxu6
 * @version 1.0
 * @className NewReleasePrice
 * @description TODO
 * @date 2020-12-29 13:34
 */
public class NewReleasePrice extends Price {
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
