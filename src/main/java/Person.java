import java.util.List;

public class Person {
    private String name;
    private List<Person> peopleThatKnow;

    public Person(String name){
        this(name, null);
    }

    public Person(String name, List<Person> knows){
        this.peopleThatKnow = knows;
        this.name = name;
    }

    public void setPeopleThatKnow(List<Person> peopleThatKnow){
        this.peopleThatKnow = peopleThatKnow;
    }
    public List<Person> getPeopleThatKnow(){
        return this.peopleThatKnow;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
