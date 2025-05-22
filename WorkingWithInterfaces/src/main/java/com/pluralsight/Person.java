package com.pluralsight;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\nPerson{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
//    @Override
//    public int compareTo(Person person) {
//        return this.lastName.compareTo(person.lastName);
//    }
    @Override
    public int compareTo(Person person) {
        int lastNameComparison = this.lastName.compareTo(person.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        } else {
            return this.firstName.compareTo(person.firstName);
        }
    }
}
