/**
 * Write a description of class MusicLibrary here.
 *
 * @Griffin Stober
 * @v1.0
 */
public class MusicLibrary
{
    
    private Album[] music;
    public MusicLibrary()
    {
    music = new Album[0];
    }
    public void add(Album a)
    {
        Album[] newMusic = new Album[music.length+1];
        System.arraycopy(music, 0, newMusic, 0, music.length);
        newMusic[newMusic.length-1] = a;
        music=newMusic;
    }
    
    public String toString(){
        String result = "";
        for(Album a: music){
            if(a != null){
                result+= a.toString()+"\n";
            }else{
                result += "EMPTY\n";
            }
        }
        return result;
    }
    public void doubleSize(){
    Album[] newMusic = new Album[music.length*2];
    System.arraycopy(music, 0, newMusic, 0, music.length);
    music=newMusic;
    }
    public void remove(int a){
    Album[] newMusic = new Album[music.length-1];
    if(music.length>1){
        System.arraycopy(music, 0, newMusic, 0, a);
        if(a<music.length-1)
        System.arraycopy(music, a+1, newMusic, a+1, newMusic.length-a-1);
    }
    music=newMusic;
    
    }
    
    public int findTitle(String target){
        
    for(int i=0;i< music.length;i++){
    if(music[i] != null && music[i].getTitle().equals(target)){
    return i;   
    }
    }
    return -1;
    }
    public int findArtist(String target){
        
    for(int i=0;i< music.length;i++){
    if(music[i] != null && music[i].getArtist().equals(target)){
    return i;   
    }
    }
    return -1;
    }
    
 public void sortTime(){
    int min;
    Album blank = new Album("","",0,0.0);
    for( int i = 0; i < music.length - 1; i++){
      min = i;
      if(music[min] == null){
           for(int l =music.length-1;l>min;l--){
               if(music[l] != null){
                   blank = music[min];
                   music[min] = music[l];
                   music[l] = blank;  
               }
           }   
       }
      for(int scan = i + 1; scan < music.length; scan++){
           if(music[scan] != null && music[min] != null &&music[scan].getTime() < music[min].getTime()){
            min = scan;   
               
           }
               
      }
      blank = music[min];
      music[min] = music[i];
      music[i] = blank;
   }
   
}
public void sortArtist(){
    int min;
    Album blank = new Album("","",0,0.0);
    for( int i = 0; i < music.length - 1; i++){
      min = i;
      if(music[min] == null){
           for(int l =music.length-1;l>min;l--){
               if(music[l] != null){
                   blank = music[min];
                   music[min] = music[l];
                   music[l] = blank;  
               }
           }   
       }
      for(int scan = i + 1; scan < music.length; scan++){
           if(music[scan] != null && music[min] != null && music[scan].getArtist().compareTo(music[min].getArtist()) >=1 ){
            min = scan;   
               
           }
               
      }
      blank = music[min];
      music[min] = music[i];
      music[i] = blank;
   }
   
}
public int binarySearchTime(double target) {
   int low = 0, high = music.length-1, middle = (low + high)/2;
   if(music[0]!=null){
       while (music[middle] == null || (music[middle].getTime() != target && low <= high)){
           if (music[middle] == null || target < music[middle].getTime())
            high = middle - 1;
           else
            low = middle + 1;
           middle = (low + high)/2;
       }
       if (music[middle].getTime() == target)
       return middle;
   }
   return -1;
   
}
public int binarySearchArtist(String target) {
   int low = 0, high = music.length-1, middle = (low + high)/2;
   if(music[0]!=null){
       while (music[middle] == null || (music[middle].getArtist() != target && low <= high)){
           if (music[middle] == null || target.compareTo(music[middle].getArtist()) >=1)
            high = middle - 1;
           else
            low = middle + 1;
           middle = (low + high)/2;
       }
       if (music[middle].getArtist() == target)
       return middle;
   }
   return -1;
   
}
        
        
    
    
    
    
    

}