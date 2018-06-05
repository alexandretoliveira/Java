package lambdasbasics;

import model.Person;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionIterateExample {

    public static void main(String[] args){
        List<Person> people = Arrays.asList(
                new Person("Alexandre", "Oliveira", 35),
                new Person("Pollyanna", "Oliveira", 35),
                new Person("Julia", "Oliveira", 35),
                new Person("Nicole", "Oliveira", 35),
                new Person("Jathil", "Oliveira", 35)
        );
        //lambda for each loop
        people.forEach(p-> System.out.println(p));
        //with method reference
        people.forEach(p -> p.setAge(p.getAge() + 1));
        people.forEach(System.out::println);

        //Stream
        people.stream()
                .filter(p -> p.getName().startsWith("A"))
                .forEach(p -> System.out.println("Stream: " + p));

        //Parallel Stream
        people.parallelStream()
                .filter(p -> p.getName().startsWith("A"))
                .forEach(p -> System.out.println("Parallel Stream: " + p));

        Stream.of(1,2,3,4,5,6,7,8,9,10,11,12)
        .filter(x -> x <5)
        .map(x -> x*x)
        .forEach(x -> System.out.println(x));


    }
}
