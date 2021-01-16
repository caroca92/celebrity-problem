import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Algorithm {

    //In a team of N people, a celebrity is
    // known by everyone but he/she doesn't know anybody
    public String findingFamousPeople(List<Person> team){
        //operations
        Optional<Person> celebrity = team
                .stream()
                .filter(person -> person.getKnows() == null)
                .findFirst();

        return (celebrity.isPresent() ? celebrity.get().toString() : "No celebrity are here");
    }

}
