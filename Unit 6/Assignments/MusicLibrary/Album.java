/**
 * Write a description of class Album here.
 *
 * @Griffin Stober
 * @v1.0
 */
public class Album
{
    String name;
    String name2;
    int tracks;
    double time;
    public Album(String a,String b, int aa, double bb)
    {
     name = a;
     name2 = b;
     tracks = aa;
     time = bb;
    }
    public String toString(){
    String result="";
    result=this.name+" | "+this.name2+" | "+this.tracks+" Tracks, "+this.time+" Minutes of Music";
    return result;
    }
    public String getTitle(){
        return this.name;
        
    }
    public String getArtist(){
        return this.name2;
        
    }
    public int getTracks(){
        return this.tracks;
    }
    public double getTime(){
        return this.time;
    }
    
}