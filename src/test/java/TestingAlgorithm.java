import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestingAlgorithm {
    @Spy
    Algorithm algorithm;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void testFindingFamousPeopleCase1(){
        Person a = new Person("Ana");
        Person b = new Person("Pedro");
        Person c = new Person("Esteban");
        Person d = new Person("Jorge");

        //List of people each one knows
        List<Person> bKnows = new ArrayList<>(Arrays.asList(a,c));
        List<Person> cKnows = new ArrayList<>(Arrays.asList(a,b,d));
        List<Person> dKnows = new ArrayList<>(Arrays.asList(a,b,d));

        //Setting the people who everyone know
        a.setPeopleThatKnow(null);
        b.setPeopleThatKnow(bKnows);
        c.setPeopleThatKnow(cKnows);
        d.setPeopleThatKnow(dKnows);

        List<Person> people = new ArrayList<>(Arrays.asList(a,b,c,d));

        String famous = algorithm.findingFamousPeople(people);

        Assert.assertEquals("Person{name='Ana'}", famous);
    }

    @Test
    public void testFindingFamousPeopleCase2(){
        //Assumptions
        Person a = new Person("Ana");
        Person b = new Person("Pedro");
        Person c = new Person("Esteban");
        Person d = new Person("Jorge");

        //List of people each one knows
        List<Person> aKnows = null;
        List<Person> bKnows = new ArrayList<>(Arrays.asList(d,c));
        List<Person> cKnows = new ArrayList<>(Arrays.asList(a,b,d));
        List<Person> dKnows = new ArrayList<>(Arrays.asList(a,b,d));

        //Setting the people who everyone know
        a.setPeopleThatKnow(aKnows);
        b.setPeopleThatKnow(bKnows);
        c.setPeopleThatKnow(cKnows);
        d.setPeopleThatKnow(dKnows);

        List<Person> people = new ArrayList<>(Arrays.asList(a,b,c,d));

        String famous = algorithm.findingFamousPeople(people);

        Assert.assertEquals("No celebrity is here", famous);
    }

    @Test
    public void testFindingFamousPeopleCase3(){
        //Assumptions
        Person a = new Person("Ana");
        Person b = new Person("Pedro");
        Person c = new Person("Esteban");
        Person d = new Person("Jorge");

        //List of people each one knows
        List<Person> aKnows = new ArrayList<>(Arrays.asList(d,c));
        List<Person> bKnows = new ArrayList<>(Arrays.asList(d,c));
        List<Person> cKnows = new ArrayList<>(Arrays.asList(a,b,d));
        List<Person> dKnows = new ArrayList<>(Arrays.asList(a,b,d));

        //Setting the people who everyone know
        a.setPeopleThatKnow(aKnows);
        b.setPeopleThatKnow(bKnows);
        c.setPeopleThatKnow(cKnows);
        d.setPeopleThatKnow(dKnows);

        List<Person> people = new ArrayList<>(Arrays.asList(a,b,c,d));

        String famous = algorithm.findingFamousPeople(people);

        Assert.assertEquals("No celebrity is here", famous);
    }
    @Test
    public void testFindingFamousPeopleCase4(){
        //Assumptions
        Person a = new Person("Ana");
        Person b = new Person("Pedro");
        Person c = new Person("Esteban");
        Person d = new Person("Jorge");

        //List of people each one knows
        List<Person> cKnows = new ArrayList<>(Arrays.asList(a,b,d));
        List<Person> dKnows = new ArrayList<>(Arrays.asList(a,b,d));

        //Setting the people who everyone know
        a.setPeopleThatKnow(null);
        b.setPeopleThatKnow(null);
        c.setPeopleThatKnow(cKnows);
        d.setPeopleThatKnow(dKnows);

        List<Person> people = new ArrayList<>(Arrays.asList(a,b,c,d));

        String famous = algorithm.findingFamousPeople(people);

        Assert.assertEquals("No celebrity is here", famous);
    }
}
