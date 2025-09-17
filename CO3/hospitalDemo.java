abstract class Staff {
private int baseSalary;
private int extraHours;

public Staff(int baseSalary,int extraHours){
this.baseSalary = baseSalary;
this.extraHours = extraHours;
}

public abstract int calculateSalary();


public void setSalary(int salary){
this.baseSalary = salary;
}

public void setHours(int hours){
this.extraHours = hours;
}

public int getSalary(){
return baseSalary;
}

public int getHours(){
return extraHours;
}

public void displayDetails(){
System.out.println("Salary: "+baseSalary+"\nExtraHours: "+extraHours+"\n");
}
}

class Doctor extends Staff{
public Doctor(int salary, int hours){
super(salary,hours);
}

public int calculateSalary(){
System.out.println("Doctor salary 1000 * extraHours:");
return getSalary() + 1000 * getHours();
}
}

class Nurse extends Staff{
public Nurse(int salary, int hours){
super(salary,hours);
}


public int calculateSalary(){
System.out.println("Nurse salary 500 * extraHours:");
return getSalary() + 500 * getHours();
}
}


class AdminStaff  extends Staff{
public AdminStaff(int salary, int hours){
super(salary,hours);
}


public int calculateSalary(){
System.out.println("AdminStaff salary 200 * extraHours:");
return getSalary() + 200 * getHours();
}
}


public class hospitalDemo{
public static void main(String[] args){
Staff s1= new Doctor(100000,2);
Staff s2= new Nurse(75000,3);
Staff s3= new AdminStaff(50000,3);
int newSalary=0;


System.out.println("-----Doctor-----");
s1.displayDetails();
newSalary = s1.calculateSalary();
s1.setSalary(newSalary);
System.out.println("After update salary:");
s1.displayDetails();



System.out.println("-----Nurse-----");
s2.displayDetails();
newSalary = s2.calculateSalary();
s2.setSalary(newSalary);
System.out.println("After update salary:");
s2.displayDetails();


System.out.println("-----AdminStaff-----");
s3.displayDetails();
newSalary = s3.calculateSalary();
s3.setSalary(newSalary);
System.out.println("After update salary:");
s3.displayDetails();
}
}
