/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stocks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//
//public class StockParsing {
//    public String[] getStocks() throws MalformedURLException, IOException {
//        URL url = new URL("https://financialmodelingprep.com/api/v3/stock/real-time-price");
//        
//        String[] stocks = new String[64000];
//        int i = 0;
//        
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
//             for (String line; (line = reader.readLine()) != null;) {
//                stocks[i] = line;
//                i++;
//            }
//        }
//        
//        return stocks;
//    }
    
public class StockParsing {
    public String[] getStocks() throws MalformedURLException, IOException {
        URL url = new URL("https://financialmodelingprep.com/api/v3/quote/AAPL,FB,PALL,USAS,THC,RZV,VLO,CAJ,MNR,RXN,VBR,TGE,NOC,WMS,"
                + "OSBC,ADP,CTV,RYAM,KDMN,SHM,LASR,BCRX,DWSH,AOD,PICB,HFC,ROSEW,RWCD,PWC,AIRI,MIY,ICHR,VOD,MACK,RIBT,CIVB,KXIN,GTYH,PATI,TSLA,SIGA,GRC,VOX,CTXR,LYTS"
                + ",FTHI,EZU,TAOP,MWA,VEGA");
        
        String[] stocks = new String[64000];
        int i = 0;
        
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"))) {
             for (String line; (line = reader.readLine()) != null;) {
                stocks[i] = line;
//                System.out.println(i + " " + line);
                i++;
                
            }
        }
        
        return stocks;
        
    }
}
