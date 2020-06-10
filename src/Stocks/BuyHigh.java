/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stocks;

/**
 *
 * @author nhame
 */
public class BuyHigh implements Strategy{
    @Override
    public String getAdvice(Stock s) {
        if(s.change > 5) {
            return "Buy";
        } else if (s.change < -5) {
            return "Sell";
        } else {
            return "Hold";
        }

    }
}
