import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithm {
    //Assumption
    Person a = new Person("Ana");
    Person b = new Person("Pedro");
    Person c = new Person("Esteban");
    Person d = new Person("Jorge");

    List<Person> bKnows = new ArrayList<>(Arrays.asList(a,c,d));
    List<Person> cKnows = new ArrayList<>(Arrays.asList(a,b,d));
    List<Person> dKnows = new ArrayList<>(Arrays.asList(a,b,d));

    List<Person> team = new ArrayList<>(Arrays.asList(a,b,c,d));

    //operations
    


}
