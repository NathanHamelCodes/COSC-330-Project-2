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
public class Stock {
        public String symbol;
        public String name;
        public double price;
        public double change;
        public double low;
        public double high;
        public double volume;
        
        public Stock(String symbol, String name, double price, double change, double low, double high, double volume) {
            this.symbol = symbol;
            this.name = name;
            this.price = price;
            this.change = change;
            this.low = low;
            this.high = high;
            this.volume = volume;
        }
    }