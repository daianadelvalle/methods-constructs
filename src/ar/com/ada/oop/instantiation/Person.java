package ar.com.ada.oop.instantiation;

public class Person {
    //attr
    private String name;
    private String lastName;
    private Integer age;
    //constructors
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public Person(String name, String lastName, Integer age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;

        // getter y setters
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }




}
