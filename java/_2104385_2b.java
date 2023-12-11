import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class _2104385_2b {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while(true)
            {
                String contentLine = br.readLine();
                if(contentLine=="End")
                    break;
                String[] firstLine = contentLine.split(",");
                String name = firstLine[0];					                 //Read Name of Investor
                int noOfCompanies = Integer.parseInt(firstLine[1]);			//Read Number of Companies
                Investor inv = new Investor(name,noOfCompanies);			//Passing Investor name and number of companies to investor constructor by creating investor class object

                readInput(br,inv);						//invoking readInput method
                report(inv);						//invoking report method to show final report
            }
        }
        catch(Exception ex)
        {
            //  System.out.println(ex);
        }
    }

    public static void readInput(BufferedReader br, Investor inv1) throws IOException {
        String continueContentLine;					//Reading other data in readInput method
        Investor investor = inv1;
        int companies = investor.numberOfStock();
        for(int i=0;i<companies;i++)
        {
            continueContentLine = br.readLine();
            // Investor inv1 = new Investor(i);
            String[] company = continueContentLine.split(",");
            String companyName = (company[0]).trim();
            double currentPrice = Double.parseDouble(company[1].trim());
            int shares = Integer.parseInt(company[2].trim());

            Stock st = new Stock(companyName,currentPrice);

            for(int j=0;j<shares;j++)
            {
                continueContentLine = br.readLine();
                String[] sharesNo = continueContentLine.split(",");
                int numberofShares = Integer.parseInt(sharesNo[0].trim());
                double sharePrice = Double.parseDouble(sharesNo[1].trim());
                st.purchase(numberofShares, sharePrice);
            }
            // System.out.println(st.getProfit());
            //readInput(st,inv);
            investor.addStock(st);
        }

    }


    public static void report(Investor i){
        i.displayStockSummary();
    }
}


/*------------------Stock Class---------------------*/

class Stock {
    private String symbol;
    private int totalShare;
    private double totalCost;
    private double currentPrice;

    public Stock() {

    }
    public Stock (String theSymbol, double currentPrice) {
        symbol = theSymbol;
        this.currentPrice = currentPrice;
    }

    public double getProfit() {

        double profit = (totalShare*currentPrice) - totalCost ;
        return profit;
    }

    public void purchase (int shares, double pricePerShare) {
        totalCost = totalCost + (shares*pricePerShare);
        totalShare = totalShare + shares;
        //System.out.println(totalCost);
        //System.out.println(totalShare);

    }

    public String getSymbol() {
        return symbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

}


/*------------------Investor Class---------------------*/

class Investor  {

    private String investorName;
    private Stock [] cosList;
    private int stockNo;
    private double profit;
    private int count=0;
    private int companyNumbers=0;
    public Investor (String Name, int n) {
        investorName = Name;
        stockNo = n;
        cosList = new Stock[stockNo];
    }

    public int numberOfStock() {
        return stockNo;
    }

    public void addStock (Stock s){
        cosList[count] = s;
        count++;
    }

    public void displayStockSummary(){
        double totalProfit=0.0;
        double max= cosList[0].getProfit();
        double min = cosList[0].getProfit();
        String maxsymbol = null;
        String minsymbol = null;
        double price=0.0;

        System.out.println(investorName+"\n");
        System.out.println("Stock\t\tCurr Price\tProfit/Loss");
        for(int i =0;i<count;i++) {
            System.out.println(cosList[i].getSymbol() + "\t\t" + cosList[i].getCurrentPrice() + "\t\t" + cosList[i].getProfit());
            totalProfit += cosList[i].getProfit();
        }

        for(int j=0;j<count;j++){
            if(cosList[j].getProfit()>=max)
            { max=cosList[j].getProfit();
                maxsymbol=cosList[j].getSymbol();
                price=cosList[j].getCurrentPrice();
            }
        }
        for(int k=0;k<count;k++)
        {
            if(cosList[k].getProfit()<=min)
            {   min = cosList[k].getProfit();
                minsymbol=cosList[k].getSymbol();
            }
        }
        System.out.println(investorName+"'s most profitable scrip is: "+maxsymbol+" : currently priced at : "+price+" Profit is $ "+max);
        System.out.print("What "+investorName+" should probably sell off ASAP is:"+minsymbol);
            System.out.println("  currently priced at  "+  cosList[1].getCurrentPrice());
            System.out.println("Profit is $ " +  cosList[1].getProfit());
            System.out.println("Total Profit/Loss =\t"+ totalProfit);

    }
}
