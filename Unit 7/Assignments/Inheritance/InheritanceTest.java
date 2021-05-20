
/**
 * 
 * @Griffin Stober
 * @v1.0
 */
public class InheritanceTest
{
    public static void main(String[] args){
        Organism Platid = new Organism("Platid",15.8,13460,.15);
        Human Bob = new Human("Robert",10.6,105640800,.95,"A",14.0,"Male");
        Gamer YoungBob = new Gamer("Jo",100.8,8900,2.45,"A",47.8,"Female","PC",45,2000.06,100.07);
        System.out.println(Platid.speedTime(10.9));
        System.out.println("Children: "+Bob.getPopulation("Children"));
        Bob.age(13.4);
        YoungBob.buyGames(4,13.4);
        System.out.println(Platid);
        System.out.println(Bob);
        System.out.println(YoungBob);
        System.out.println(Platid.equals(Bob));
        Gamer YoungestBob = new Gamer("Jo",100.8,8900,2.45,"A",47.8,"Female","PC",45,2000.06,100.07);
        System.out.println(YoungestBob.compareTo(Bob));
        Organism YoungerBob = new Gamer("Joer",14.2,460,.15,"A",16.0,"Female","PC",25,280.6,90.7);
    }
}
