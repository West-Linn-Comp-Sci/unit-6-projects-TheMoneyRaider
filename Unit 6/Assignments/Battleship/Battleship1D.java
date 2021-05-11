import java.util.ArrayList;
public class Battleship1D {
    private ArrayList<Battleship>sea;
    public int guessNum=0;
    public Battleship1D()
    {
      sea=new ArrayList<Battleship>();
    }
    public boolean guess(int target){
        int negativeTotal=0;
        for(int j=0;j<sea.size();j++){
        if(this.sea.get(j).getLife()==true){
            for(int h = 0;h<sea.get(j).getLength();h++){
             if(this.sea.get(j).getPos(h)==target){
              this.sea.get(j).setNPos(h,-1);
              
              for(int u = 0;u<sea.get(j).getLength();u++){
                if(this.sea.get(j).getPos(u)==-1)
                negativeTotal++;
              }
              if(negativeTotal==sea.get(j).getLength()){
              this.sea.get(j).die();
              System.out.println("You sunk a battleship!");
              return true;
              }else
              System.out.println("You hit a battleship!");
              return true;
              }
            }
            }
        }
        
            
        
        


    System.out.println("You missed!");
    return false;    
    }
    public void setShip(Battleship a,int place){
        a.setPos(place);
        sea.add(a);

    }  
    public int getSeaSize(){
        return sea.size();
    }
    public Battleship getShip(int i){
        return sea.get(i);
    }
    public ArrayList getSea(){
        return sea;
    }
    public boolean checkLife(int j){
    return this.sea.get(j).getLife(); 
        
    }
    
}