//40. Constructor = A special method to initialize objects
//                  you can pass arguments to a constructor
//                  and set up initial values
public class Student_40  {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    //Constructor ,auto call when new;
    Student_40(String name,int age,double gpa){
        //this refers to Object we are currently working with, student1 or student2
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true; //default value instead of passing from argument
    }

    void study(){
        //after assiging values to your attributes using a Constructor;
        //You can use them within methods or change them;
        System.out.println(this.name+ " is studying.");
    }
}
