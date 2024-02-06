package collections;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private String city;
    private byte age;

    public Person(String name, String city, byte age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "[" + "name='" + name + '\'' +
                        ", city='" + city + '\'' +
                        ", age=" + age + "]";
    }


    @Override
    public int compareTo(Person person) {
//        return this.name.length() -person.name.length();
        if (this.name.length() == person.name.length()) {
            return this.age - person.age;
        } else {
            return this.name.length() - person.name.length();
        }

    }
//    @Override
//    public int hashCode() {
//        return this.getAge();
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, age);
    }

    @Override
    public boolean equals(Object obj) {
        Person person = null;
        if (obj instanceof Person) {
            person = (Person) obj;
        }
        if (this.getName().equals(person.getName())) {
            return true;
        } else {
            return false;
        }
    }

}
