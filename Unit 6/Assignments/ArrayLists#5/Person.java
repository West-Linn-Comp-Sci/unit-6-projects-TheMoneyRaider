
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Person
     */
    private int myAge;
    private String myName;
    public Person(int myAge1,String myName1)
    {
        myAge =myAge1;
        myName =myName1;
    }
    public int getAge()
    {
        return this.myAge;
    }
    public String getName()
    {
        return this.myName;
    }
}
