import java.util.*;
public class Buy_Sell_stock {
    public static int Buy_sell_stock(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i<prices.length; i++){
            if(buyprice < prices[i]){
                // profit
                int profit = prices[i] - buyprice; // today's Profit
                maxProfit = Math.max(maxProfit,profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[]= {7,1,5,3,6,4};
        System.out.println(Buy_sell_stock(prices));
    }
}
