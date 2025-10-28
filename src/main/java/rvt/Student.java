package rvt;

public class Student {
    // property (class name)
    // fields (class name)
    // lauks (class name)
    // attribute (class name)

    private String name;
    private int age;


    // Konstruktora metode
    // Tiek izsaukta objekta veidosanas laikā
    // Java automatiski izveido priekš
    // Jums tukšo konstruktura metodi
    public Student(String n, int a) {
        name = n;
        age = a;
    }

    public void introduce() {
        System.out.println("Student: " + name + ", age: " + age);
    }
    
}
