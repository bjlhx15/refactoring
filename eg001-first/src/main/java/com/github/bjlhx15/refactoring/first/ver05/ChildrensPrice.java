package com.github.bjlhx15.refactoring.first.ver05;

/**
 * @author lihongxu6
 * @version 1.0
 * @className ChildrensPrice
 * @description TODO
 * @date 2020-12-29 13:32
 */
public class ChildrensPrice extends Price {
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}
