import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Unit1Exercise {

    public static void main(String[] args){
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Nicole", "Oliveira", 1));
        people.add(new Person("Jathil", "Oliveira", 60));
        people.add(new Person("Pollyanna", "Oliveira", 30));
        people.add(new Person("Julia", "Oliveira", 2));
        people.add(new Person("Alexandre", "Oliveira", 35));
        people.add(new Person("Andre", "Oliveira", 1));

        //Sort list by firstName
        //people.sort((o1, o2) -> (o1.getFirstName().compareToIgnoreCase(o2.getFirstName())));
        Collections.sort(people,(o1, o2) -> (o1.getFirstName().compareToIgnoreCase(o2.getFirstName())));

        //Create a method that prints all elements in the list
        printConditionally(people, person -> true);

        //Create a method that prints all elements that have firstName beginning with A
        printConditionally(people, person -> (person.getFirstName().startsWith("A")));
    }

    public static void printConditionally(List<Person> people, Predicate<Person> condition){
        for (Person person : people) {
            if(condition.test(person))
                System.out.println(person.toString());
        }
    }

//    interface MyLambda{
//        public boolean print(Person person);
//    }

//    public static void print(List<Person> people){
//        for (Person person : people) {
//            System.out.println(person.toString());
//        }
//    }
//    public static void printA(List<Person> people){
//        for (Person person : people) {
//            if(person.getFirstName().startsWith("A"))
//                System.out.println(person.toString());
//        }
//    }



}
