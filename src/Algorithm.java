import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Algorithm {

    public static void main(String[] args) {
        //In a team of N people, a celebrity is
        // known by everyone but he/she doesn't know anybody
        Algorithm algorithm = new Algorithm();

        algorithm.findingFamousPeople(algorithm.buildingPeopleCase1());
        algorithm.findingFamousPeople(algorithm.buildingPeopleCase2());

    }
    public void findingFamousPeople(List<Person> team){
        //operations
        Optional<Person> celebrity = team
                .stream()
                .filter(person -> person.getKnows() == null)
                .findFirst();

        System.out.println("Most famous: " + (celebrity.isPresent() ? celebrity.get() : "No celebrity are here"));
    }

    //Case 1: Ana knows no one people and she is famous
    public List<Person> buildingPeopleCase1(){
        //Assumptions
        Person a = new Person("Ana");
        Person b = new Person("Pedro");
        Person c = new Person("Esteban");
        Person d = new Person("Jorge");

        //List of people each one knows
        List<Person> aKnows = null;
        List<Person> bKnows = new ArrayList<>(Arrays.asList(a,c));
        List<Person> cKnows = new ArrayList<>(Arrays.asList(a,b,d));
        List<Person> dKnows = new ArrayList<>(Arrays.asList(a,b,d));

        //Setting the people who everyone know
        a.setKnows(aKnows);
        b.setKnows(bKnows);
        c.setKnows(cKnows);
        d.setKnows(dKnows);

        return new ArrayList<>(Arrays.asList(a,b,c,d));
    }
    //Case 2: No one is famous
    public List<Person> buildingPeopleCase2(){
        //Assumptions
        Person a = new Person("Ana");
        Person b = new Person("Pedro");
        Person c = new Person("Esteban");
        Person d = new Person("Jorge");

        //List of people each one knows
        List<Person> aKnows = new ArrayList<>(Arrays.asList(b,c));
        List<Person> bKnows = new ArrayList<>(Arrays.asList(d,c));
        List<Person> cKnows = new ArrayList<>(Arrays.asList(a,b,d));
        List<Person> dKnows = new ArrayList<>(Arrays.asList(a,b,d));

        //Setting the people who everyone know
        a.setKnows(aKnows);
        b.setKnows(bKnows);
        c.setKnows(cKnows);
        d.setKnows(dKnows);

        return new ArrayList<>(Arrays.asList(a,b,c,d));
    }
}
