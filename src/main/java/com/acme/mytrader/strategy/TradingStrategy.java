package com.acme.mytrader.strategy;

import com.acme.mytrader.price.PriceListenerImpl;

/**
 * <pre>
 * User Story: As a trader I want to be able to monitor stock prices such
 * that when they breach a trigger level orders can be executed automatically
 * </pre>
 */
public class TradingStrategy {
    private PriceListenerImpl priceListener;

    public TradingStrategy() {
        this.priceListener = new PriceListenerImpl();
    }

    public void executeTradingStrategy() {
        this.priceListener.priceUpdate("IBM", 55);
    }
}
