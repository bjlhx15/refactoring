package com.github.bjlhx15.refactoring.first.ver01;

/**
 * @author lihongxu6
 * @version 1.0
 * @className Movie
 * @description TODO
 * @date 2020-12-28 13:15
 */
public class Movie {
    public static final int CHILDRENS = 2; //儿童
    public static final int REGULAR = 0; //常客
    public static final int NEW_RELEASE = 1;// 新片
    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public String getTitle() {
        return _title;
    }

    public void setPriceCode(int priceCode) {
        _priceCode = priceCode;
    }
}
