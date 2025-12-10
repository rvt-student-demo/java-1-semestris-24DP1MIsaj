package rvt;

import java.util.ArrayList;

public class Person_and_subclasses {
    public static class Person {
        private String name;
        private String address;

        public Person(String name, String address) {
            this.name = name;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + address;
        }
    }

    public static class Student extends Person {
        private int studyCredits;

        public Student(String name, String address) {
            super(name, address);
            this.studyCredits = 0;
        }

        public void study() {
            studyCredits++;
        }

        public int credits() {
            return studyCredits;
        }

        @Override
        public String toString() {
            return super.toString() + " Study credits " + studyCredits;
        }
    }

    public static class Teacher extends Person {
        private int salary;

        public Teacher(String name, String address, int salary) {
            super(name, address);
            this.salary = salary;
        }

        @Override
        public String toString() {
            return super.toString() + " salary " + salary + " euro/month";
        }
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }

    public static class MainProgram {
        public static void main(String[] args) {
            ArrayList<Person> persons = new ArrayList<Person>();
            persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
            persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

            printPersons(persons);

            Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
            for (int i = 0; i < 25; i++) {
                ollie.study();
            }
            System.out.println(ollie);
        }
    }
}