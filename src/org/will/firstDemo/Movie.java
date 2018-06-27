package org.will.firstDemo;

/**
 * ClassName:Movie
 * Description:
 *
 * @author Will Wu
 * @email willWu618@gmail.com
 * @date 2018年06月25日
 */
public class Movie {
    /**
     * 儿童片
     */
    public static final int CHILDRENS = 2;
    /**
     * 普通片
     */
    public static final int REGULAR = 0;
    /**
     * 新片
     */
    public static final int NEW_RELEASE = 1;

    /**
     * 影片名称
     */
    private String title;

    /**
     * 类别
     */
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
