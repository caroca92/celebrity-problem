import java.util.List;
import java.util.Optional;

public class Algorithm {

    //In a team of N people, a celebrity is
    // known by everyone but he/she doesn't know anybody
    public String findingFamousPeople(List<Person> team){
        //operations
        Optional<Person> candidateToBeCelebrity = team
                .stream()
                .filter(person -> person.getPeopleThatKnow() == null || person.getPeopleThatKnow().isEmpty())
                .findFirst();

        Boolean isCandidateToBeCelebrityACelebrity = Boolean.FALSE;

        if(candidateToBeCelebrity.isPresent()){
            isCandidateToBeCelebrityACelebrity = team
                    .stream()
                    .filter(person -> person.getPeopleThatKnow() != null)
                    .allMatch(person -> person.getPeopleThatKnow().contains(candidateToBeCelebrity.get()));
        }

        return (isCandidateToBeCelebrityACelebrity ? candidateToBeCelebrity.get().toString() : "No celebrity is here");
    }

}
