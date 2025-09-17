abstract class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Encapsulation: Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    // Abstract method
    public abstract String getRole();
}
class Student extends Person {
    public Student(String name, int id) {
        super(name, id);
    }


    public String getRole() {
        return "Student";
    }
}
class Professor extends Person {
    public Professor(String name, int id) {
        super(name, id);
    }

    public String getRole() {
        return "Professor";
    }
}

public class University {
    public static void main(String[] args) {
        Person s = new Student("Anitta", 101);
        Person p = new Professor("Dr. John", 501);

        System.out.println(s.getName() + " is a " + s.getRole());
        System.out.println(p.getName() + " is a " + p.getRole());
    }
}

