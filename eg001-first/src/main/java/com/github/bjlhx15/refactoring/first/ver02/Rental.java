package com.github.bjlhx15.refactoring.first.ver02;

/**
 * @author lihongxu6
 * @version 1.0
 * @className Rental
 * @description TODO
 * @date 2020-12-28 13:17
 */
public class Rental {
    private Movie _movie; // 影片
    private int _daysRented; // 租期

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
}