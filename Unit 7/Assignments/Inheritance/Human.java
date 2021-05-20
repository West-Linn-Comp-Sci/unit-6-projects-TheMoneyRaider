
/**
 *
 *
 * @Griffin Stober
 * @v1.0
 */
public class Human extends Organism
{
    private String race;
    private double age;
    private String gender;
  public Human(String name,double AvCells,int population,double growthSpeed,String race,double age,String gender)
   {
        super(name,AvCells,population,growthSpeed);
        this.race=race;
        this.age=age;
        this.gender=gender;
    }
    public String getRace(){
    return this.race;
    }
    public String getGender(){
    return this.gender;
    }
    public double getAge(){
    return this.age;
    }
  public int getPopulation(String type){
        int i=-1;
        if(type=="Children")
            i=(int)((double)super.getPopulation()*.25);
        if(type=="Adults")
            i=(int)((double)super.getPopulation()*.5);
        if(type=="Elderly")
            i=(int)((double)super.getPopulation()*.125);
        if(type=="Crazy")
            i=(int)((double)super.getPopulation()*.125);
        return i;
    }
  public boolean equals(Human other){  
        boolean answer=false;
        if((this.getPopulation("Children")==other.getPopulation("Children"))&&(this.getName()==other.getName())&&(this.race==other.race)&&(this.gender==other.gender)&&(this.age==other.age)&&(this.getCells()==other.getCells())&&(this.getGrowth()==other.getGrowth()))
            answer=true;
        return answer;
    }
  public void age(double time){
    this.age+=time; 
       if(this.age>100){
           this.age=0;
    }
   } 
  @Override
   public String toString(){
       return "Human Name: "+this.getName()+"\n"
          +"Population of Children: "+this.getPopulation("Children")+"\n"+
          "Population of Adults: "+this.getPopulation("Adults")+"\n"+
          "Population of Elderly: "+this.getPopulation("Elderly")+"\n"+
          "Population of Crazy: "+this.getPopulation("Crazy")+"\n"+
          "Race: "+this.race+" ,Age: "+this.age+" years";
    
   }
  public interface Comparable
   {
       int compareTo(Human other);
   }
   public int compareTo(Human other)
   {
       int balance=0;
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
