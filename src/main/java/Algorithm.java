import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Algorithm {

    //In a team of N people, a celebrity is
    // known by everyone but he/she doesn't know anybody
    public String findingFamousPeople(List<Person> team){
        //operations
        Map<Person, Integer> countingPersonAppearance = new HashMap<>();

        List<Person> justOneFamousAllowed = team
                .stream()
                .filter(person -> {
                    if(person.getPeopleThatKnow() == null || person.getPeopleThatKnow().isEmpty()){
                        countingPersonAppearance.put(person, 0);
                        return true;
                    }
                    person.getPeopleThatKnow().forEach(peopleWhoKnow -> {
                        if(countingPersonAppearance.get(peopleWhoKnow) == null){
                            countingPersonAppearance.put(peopleWhoKnow, 0);
                        }else{
                            countingPersonAppearance.put(peopleWhoKnow, countingPersonAppearance.get(peopleWhoKnow) + 1);
                        }
                    });
                    return false;
                })
                .collect(Collectors.toList());
        Boolean isCandidateToBeCelebrityACelebrity = Boolean.FALSE;
        if(justOneFamousAllowed.size() > 1 || justOneFamousAllowed.size() < 1){
            return "No celebrity is here";
        }else {
            isCandidateToBeCelebrityACelebrity = countingPersonAppearance.get(justOneFamousAllowed.get(0)).equals(team.size() - 1);
        }

        return (isCandidateToBeCelebrityACelebrity ? justOneFamousAllowed.get(0).toString() : "No celebrity is here");
    }

}
