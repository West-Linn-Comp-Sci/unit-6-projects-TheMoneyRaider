
import java.util.ArrayList;
import java.util.List;

public class BurgerByte {

    private String location;
    private Manager manager;
    private boolean isOpen;
    private List<Employee> employees;

    public BurgerByte(String locn, Manager m) {
        location = locn;
        manager = m;
        employees = new ArrayList<>();
    }

    // getters
    public String getLocation() { return location; }
    public Manager getManager() { return manager; }
    public List<Employee> getStaff() { return employees; }
    public boolean isOpen() { return isOpen; }

    // EFFECTS: "opens" this restaurant, i.e. set isOpen to true
    public void openRestaurant() {
        isOpen = true;
    }

    // EFFECTS: sets the isOpen field to false, and sends all employees home (off work)
    public void closeRestaurant() {
        isOpen = false;
        for (Employee c : employees) {
            c.leaveWork();
        }
        manager.leaveWork();
    }

    // REQUIRES: c must not be in this cashiers or this BurgerByte's Manager's cashiers
    // MODIFIES: this
    // EFFECTS: adds the given cashier to this cashiers
    public void addStaff(Employee c) {
        employees.add(c);
    }

    // REQUIRES: c must be in this cashiers and this BurgerByte's Manager's cashiers
    // MODIFIES: this
    // EFFECTS: removes the given cashier from this cashiers
    public void removeStaff(Employee c) {
        employees.remove(c);
    }

    // EFFECTS: computes wages for all employees, prints them out in this format
    //          Name: ______, Salary: _______ for each employee
    public void computeStaffWages() {
        for (Employee c : employees) {
            System.out.println("Name: " + c.getName() +", Salary: " + c.computeWage());
        }
        System.out.println("Name: " + manager.getName() +", Salary: " + manager.computeWage());
    }


}