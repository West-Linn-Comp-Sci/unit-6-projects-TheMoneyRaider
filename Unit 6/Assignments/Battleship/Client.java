public class Client
{
    public static void main(String[] args)
    {
    //guess array
    int[] guess = {1,2,3,4,5,6,7,8,0};
    int guessNum=0;
    //begin game
    Battleship1D game = new Battleship1D();
    Battleship ship = new Battleship(3);
    Battleship ship2 = new Battleship(3);
    game.setShip(ship,0);
    game.setShip(ship2,3);
    //make a loop to check all the guesses
        //make a loop to check all the guesses
        int totalBattleships=0;
        
        for(int i=0;i<guess.length; i++){
        guessNum++;    
            if(game.guess(guess[i])==true){
                totalBattleships=0;
                for(int j=0;j<game.getSea().size();j++){
                    if(game.checkLife(j)==true){
                        totalBattleships++;    
                    }
                }
                if(totalBattleships==0){
                System.out.println("You won! Over the game you took "+ guessNum+ " guesses!");
                break;
                }
            
            }
        }
        if(totalBattleships != 0)
              System.out.println("You failed! You miserable piece of crap!");
        


      
    }
    
}

