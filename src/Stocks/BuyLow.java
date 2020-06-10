package Stocks;

/**
 *
 * @author nhame
 */
public class BuyLow implements Strategy{
    @Override
    public String getAdvice(Stock s) {
        if(s.change > 5) {
            return "Sell";
        } else if (s.change < -5) {
            return "Buy";
        } else {
            return "Hold";
        }

    }
}