
/**
 *
 *
 * @Griffin Stober
 * @v1.0
 */
public class Gamer extends Human
{
    private String ui;
    private double hoursSpent;
    private int games;
    private double wallet;
   public Gamer(String name,double AvCells,int population,double growthSpeed,String race,double age,String gender,String ui, int games, double hoursSpent,double wallet)
   {
        super(name,AvCells,population,growthSpeed,race,age,gender);
        this.ui=ui;
        this.games=games;
        this.hoursSpent=hoursSpent;
        this.wallet =wallet;
    }
   public String getUi(){
   return this.ui; 
   }
   public int getGames(){
   return this.games; 
   }
   public double getHoursSpent(){
   return this.hoursSpent; 
   }
   public void buyGames(int gamesBuy,double price){
       this.games+=gamesBuy;
       gamesBuy*=price;
       this.wallet-=gamesBuy;
   }
   public double getWallet(){
   return this.wallet; 
   }
   public boolean equals(Gamer other){  
        boolean answer=false;
        if((this.ui==other.getUi())&&(this.wallet==other.getWallet())&&(this.games==other.getGames())&&(this.hoursSpent==other.getHoursSpent())&&(this.getPopulation("Children")==other.getPopulation("Children"))&&(this.getName()==other.getName())&&(this.getRace()==other.getRace())&&(this.getGender()==other.getGender())&&(this.getAge()==other.getAge())&&(this.getCells()==other.getCells())&&(this.getGrowth()==other.getGrowth()))
            answer=true;
        return answer;
    }
   @Override
   public String toString(){
       return "Gamer Name: "+this.getName()+"\n"
          +"Population of Children: "+this.getPopulation("Children")+"\n"+
          "Population of Adults: "+this.getPopulation("Adults")+"\n"+
          "Population of Elderly: "+this.getPopulation("Elderly")+"\n"+
          "Population of Crazy: "+this.getPopulation("Crazy")+"\n"+
          "Race: "+this.getRace()+" ,Age: "+this.getAge()+" years \n"+
          "User Interface: "+this.ui+" ,Amount of Games: "+this.games+" games"+ "\nHours Spent Playing: "+ this.hoursSpent;
    
   }
   public interface Comparable
   {
       int compareTo(Gamer other);
   }
   public int compareTo(Gamer other)
   {
       int balance=0;
       if(this.wallet>=other.getWallet())
        balance++;
       else if(this.wallet<=other.getWallet())
        balance--;
       if(this.games>=other.getGames())
        balance++;
       else if(this.games<=other.getGames())
        balance--;
       if(this.hoursSpent>=other.getHoursSpent())
        balance++;
       else if(this.hoursSpent<=other.getHoursSpent())
        balance--;
       if(this.getAge()>=other.getAge())
        balance++;
       else if(this.getAge()<=other.getAge())
        balance--;
       if(this.getPopulation()>=other.getPopulation())
        balance++;
       else if(this.getPopulation()<=other.getPopulation())
        balance--;
       return balance;
   } 
}
