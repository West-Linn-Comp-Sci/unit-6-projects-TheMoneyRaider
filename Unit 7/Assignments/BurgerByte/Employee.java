abstract class Employee{
   public static final double BASE_WAGE = 10.00;
   public String name;
   public int age;
   public double hoursWorked;
   public boolean atWork;
   public Employee(String name,int age)
   {
     this.name = name;
     this.age = age;
     this.hoursWorked = 0;
     atWork = false;
   }
   public String getName(){return this.name;}
   public int getAge(){return this.age;}
   public boolean isAtWork(){return this.atWork;}
   public double getHoursWorked(){return this.hoursWorked;}
   public abstract void startWork(double hours);
   public abstract void leaveWork();
   public abstract double computeWage();
   public void logHoursWorked(double hours) {hoursWorked += hours;}
}
