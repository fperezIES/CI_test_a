package data;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(){
        this.name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
