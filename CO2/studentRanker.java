class Student {
    private String name;
    private int marks;


    Student(String name) {
        this.name = name;
        this.marks = 0;
    }

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }


    void setMarks(int marks){
     this.marks = marks;
    }

    char  CalculateGrade() {
        if ( this.marks > 90) {
	   return 'A';
        } else if (this.marks > 75 ) {
	    return 'B';
        } else if (this.marks > 60) {
	   return 'C';
        } else if (this.marks > 40) {
	  return 'D';
        } else {
	   return 'F';
        }
    }


    void displayResult() {
	System.out.println("Name: "+name+"\n"+"Marks: "+marks+"\n"+"Grade: "+ CalculateGrade());

  }
}

public class studentRanker {
    public static void main(String[] args) {
        Student s1 = new Student("Arya");
	Student s2 = new Student("Bob", 55);
	//Student s3=new Student();
	s1.setMarks(74);
        s1.displayResult();
	s2.displayResult();
    }
}
