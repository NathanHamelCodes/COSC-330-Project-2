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
public class GeneralParsing {
    public String[] nameParse(String[] s) {
        int it = 0;
        int iter = 0;
        String[] nameList = new String[50];
        String delim = "[:\"]";
        
//        for(String j : s) {
//            if(j != null) {
//            System.out.println(iter + " " + j);
//            iter++;
//            }
//        }
        
        for(int i = 2; i < s.length; i+=23) {
            if(s[i] != null) {
                String[] x = s[i].split(delim);
                for(int j = 4; j < x.length; j += 6) {
                   nameList[it] = x[j];
                   it++;
                }
            }
        }
        return nameList;
    }
    
    public String[] symbolParse(String[] s) {
        int it = 0;
        String[] nameList = new String[50];
        String delim = "[:\"]";
        
        for(int i = 1; i < s.length; i+=23) {
            if(s[i] != null) {
                String[] x = s[i].split(delim);
                for(int j = 4; j < x.length; j += 6) {
                   nameList[it] = x[j];
                   it++;
                }
            }
        }
        return nameList;
    }
    
    public double[] priceParse(String[] s) {
        int it = 0;
        double[] priceList = new double[50];
        String delim = "[:,\"]";
        
        
        
        for(int i = 3; i < s.length; i+=23) {
            if(s[i] != null) {
                String[] x = s[i].split(delim);
                for(int j = 3; j < x.length; j += 6) {
                   priceList[it] = Double.parseDouble(x[j]);
                   it++;
                }
            }
        }
        return priceList;
    }
    
    public double[] changeParse(String[] s) {
        int it = 0;
        double[] changeList = new double[50];
        String delim = "[:,\"]";
        
        
        
        for(int i = 4; i < s.length; i+=23) {
            if(s[i] != null) {
                String[] x = s[i].split(delim);
                for(int j = 3; j < x.length; j += 6) {
                   changeList[it] = Double.parseDouble(x[j]);
                   it++;
                }
            }
        }
        return changeList;
    }
    
    public double[] lowParse(String[] s) {
        int it = 0;
        double[] lowList = new double[50];
        String delim = "[:,\"]";
        
        
        
        for(int i = 6; i < s.length; i+=23) {
            if(s[i] != null) {
                String[] x = s[i].split(delim);
                for(int j = 3; j < x.length; j += 6) {
                   lowList[it] = Double.parseDouble(x[j]);
                   it++;
                }
            }
        }
        return lowList;
    }
    
    public double[] highParse(String[] s) {
        int it = 0;
        double[] highList = new double[50];
        String delim = "[:,\"]";
        
        
        
        for(int i = 7; i < s.length; i+=23) {
            if(s[i] != null) {
                String[] x = s[i].split(delim);
                for(int j = 3; j < x.length; j += 6) {
                   highList[it] = Double.parseDouble(x[j]);
                   it++;
                }
            }
        }
        return highList;
    }
    
    public double[] volumeParse(String[] s) {
        int it = 0;
        double[] volumeList = new double[50];
        String delim = "[:,\"]";
        
        
        
        for(int i = 13; i < s.length; i+=23) {
            if(s[i] != null) {
                String[] x = s[i].split(delim);
                for(int j = 3; j < x.length; j += 6) {
                   volumeList[it] = Double.parseDouble(x[j]);
                   it++;
                }
            }
        }
        return volumeList;
    }
}
