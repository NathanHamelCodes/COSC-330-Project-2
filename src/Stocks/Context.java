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
public class Context {
    private Strategy strat;
    private Stock s;
    
    public Context(Strategy strat, Stock s) {
        this.strat = strat;
        this.s = s;
    }
    
    public String executeStrategy() {
        return strat.getAdvice(s);
    }
}
