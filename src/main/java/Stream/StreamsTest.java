package Stream;

import model.Person;
import java.util.*;


public class StreamsTest{

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
               new Person("Jathil", "Nunes", 60),
                new Person("Pollyanna", "Oliveira", 30),
                new Person("Nicole", "Oliveira", 1),
                new Person("Alexandre", "Oliveira", 35),
                new Person("Julia", "Oliveira", 2)
        );

        Collections.sort(people);

        people.stream()
                .filter(p -> p.getLasName().startsWith("O"))
                .forEach(p -> System.out.println(p.getName()));

    }
}