package com.acme.mytrader.price;

public class PriceListenerImpl implements PriceListener {

    public void priceUpdate(String security, double price) {
        System.out.println("Security = " + security + "\nprice = " + price);
    }
}
