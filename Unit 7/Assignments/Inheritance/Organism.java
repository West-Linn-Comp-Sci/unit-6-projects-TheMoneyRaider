
/**
 * Write a description of class Organism here.
 *
 * @Griffin Stober
 * @v1.0
 */
public class Organism
{
    // instance variables - replace the example below with your own
    private String name;
    private double AvCells;
    private int population;
    private double growthSpeed;
    public Organism(String name,double AvCells,int population,double growthSpeed)
    {
      this.name=name;
      this.AvCells=AvCells;
      this.population=population;
      this.growthSpeed=growthSpeed;
    }
    public String getName()
    {
        return this.name;
    }
    public int getPopulation()
    {
        return this.population;
    }
    public double getCells()
    {
        return this.AvCells;
    }
    public double getGrowth()
    {
        return this.growthSpeed;
    }
    public void setName(String NAME){
        this.name=NAME;
    }
    public void setGrowth(double growth){
        this.growthSpeed=growth;
    }
    public int speedTime(double years){
        this.population=(int)(growthSpeed*years*this.population);
        return this.population;
    }
    public String toString(){
        return "Organism Name: "+this.name+"\n"+"Organism Population: "+this.population;
    }
    public boolean equals(Organism other){  
        boolean answer=false;
        if((this.getPopulation()==other.getPopulation())&&(this.getName()==other.getName())&&(this.getCells()==other.getCells())&&(this.getGrowth()==other.getGrowth()))
            answer=true;
        return answer;
    }
}
