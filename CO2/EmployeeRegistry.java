class Employee{
    private int empId;
    private String name;
    private double salary;


public Employee(int empId, String name, double salary){
this.empId = empId;
this.name = name;
this.salary = salary;
}

public void displayEmployee(){
System.out.println("Id: "+empId+"\nName: "+name+"\nSalary: "+salary+"\n");
}

public void updateSalary(double newSalary){
salary = newSalary;
}

public double getSalary() {
  return this.salary;
}
}

class EmployeeRegistry{
    // Promote method
    public static void promote(Employee emp, double bonus) {
        double newSalary = emp.getSalary() + bonus;
        emp.updateSalary(newSalary);
        System.out.println("Employee promoted with bonus: " + bonus);
	emp.displayEmployee();
    }
public static void main(String[] args){
Employee[] emp= new Employee[2];
emp[0] = new Employee(1, "Sai",55000);
emp[1] = new Employee(2, "Raj",47000);


for(int i=0;i<2;i++){
emp[i].displayEmployee();
if(i==1){
System.out.println("After Salary Update:");
emp[i].updateSalary(70000);
emp[i].displayEmployee();
}
}
System.out.println("Promoting Employee 2:");
promote(emp[1], 3000);
}
} 
