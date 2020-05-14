package com.acme.mytrader.strategy;

import com.acme.mytrader.execution.ExecutionServiceImpl;
import com.acme.mytrader.model.Trade;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TradingStrategyTest {
    @Test
    public void testTradingStrategy() {
        TradingStrategy strategy = new TradingStrategy();

        strategy.executeTradingStrategy();
    }

    @Test
    public void testExecutionServiceBuy() {
        ExecutionServiceImpl trader = new ExecutionServiceImpl();
        Trade expectedTrade = new Trade("IBM", Trade.BUY, 55.0, 100);

        trader.buy("IBM", 55.0, 100);

        ArrayList<Trade> trades = trader.getTrades();

        assertEquals(1, trades.size());
        assertEquals(expectedTrade, trades.get(0));
    }

    @Test
    public void testExecutionServiceSell() {
        ExecutionServiceImpl trader = new ExecutionServiceImpl();
        Trade expectedTrade = new Trade("IBM", Trade.SELL, 55.0, 100);

        trader.sell("IBM", 55.0, 100);

        ArrayList<Trade> trades = trader.getTrades();

        assertEquals(1, trades.size());
        assertEquals(expectedTrade, trades.get(0));
    }
}
