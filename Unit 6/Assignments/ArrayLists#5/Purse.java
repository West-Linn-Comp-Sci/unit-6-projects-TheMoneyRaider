import java.util.ArrayList;
// A Purse holds a collection of Coins 
public class Purse { 
    private ArrayList<Coin> coins; 
 
    public Purse() { 
        coins = new ArrayList(); 
    }
 
    // adds aCoin to the purse 
    public void add(Coin aCoin) { 
        coins.add(aCoin); 
    } 
 
    // returns total value of all coins in purse 
    public double getTotal() { 
        double count=0;
        for(int i=0;i<coins.size();i++){
            count+=this.coins.get(i).getValue();
        }
        return count;
    } 
 
    // returns the number of coins in the Purse that matches aCoin 
    // (both myName & myValue) 
    public int count(Coin aCoin) {
        int count=0;
        for(int i=0;i<coins.size();i++){
            if(this.coins.get(i).getName().equals(aCoin.getName())&&this.coins.get(i).getValue()==aCoin.getValue())
            count++;
        }
        return count;
    } 
 
    // returns the name of the Coin in the Purse that has the smallest value 
    public String findSmallest() {
        String name="";
        double value=Integer.MAX_VALUE;
        for(int i =0; i<coins.size();i++){
            if(coins.get(i).getValue()<value){
            value=coins.get(i).getValue();
            name=coins.get(i).getName();
            }
        }
        return name;
    } 
}

