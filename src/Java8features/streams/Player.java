package Java8features.streams;

import java.util.Objects;

class Player {
    private  String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  String getName() {

        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return age == player.age && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Player[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }


}


