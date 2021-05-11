
/**
 * Write a description of class toDos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class toDos
{
    public static void main(String[] args){
    ArrayList<String>toDoList=new ArrayList<String>();
    String toDo1="Water plants";
    String toDo2="Eat dog";
    String toDo3="Destoy world";
    toDoList.add(toDo1);
    toDoList.add(toDo2);
    toDoList.add(toDo3);
    System.out.println(toDoList);
    System.out.println(toDoList.remove(0));
    
    }
}
