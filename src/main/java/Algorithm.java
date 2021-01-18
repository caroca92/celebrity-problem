import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Algorithm {

    //In a team of N people, a celebrity is
    // known by everyone but he/she doesn't know anybody
    public String findingFamousPeople(List<Person> team){
        //operations
        List<Person> justOneFamousAllowed = team
                .stream()
                .filter(person -> person.getPeopleThatKnow() == null || person.getPeopleThatKnow().isEmpty())
                .collect(Collectors.toList());
        Boolean isCandidateToBeCelebrityACelebrity = Boolean.FALSE;
        if(justOneFamousAllowed.size() > 1 || justOneFamousAllowed.size() < 1){
            return "No celebrity is here";
        }else {
            isCandidateToBeCelebrityACelebrity = team
                    .stream()
                    .filter(person -> person != justOneFamousAllowed.get(0))
                    .allMatch(person -> person.getPeopleThatKnow().contains(justOneFamousAllowed.get(0)));
        }

        return (isCandidateToBeCelebrityACelebrity ? justOneFamousAllowed.get(0).toString() : "No celebrity is here");
    }

}
