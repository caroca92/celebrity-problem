import java.util.List;

public class Person {
    private String name;
    private List<Person> knows;

    public Person(String name){
        this(name, null);
    }

    public Person(String name, List<Person> knows){
        this.knows = knows;
        this.name = name;
    }

    public void setKnows(List<Person> knows){
        this.knows = knows;
    }
    public List<Person> getKnows(){
        return this.knows;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
