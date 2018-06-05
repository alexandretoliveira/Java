public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String arg[]){
        Greeter greeter = new Greeter();
        greeter.greet(new HelloWorldGreeting());

        //Interface implementation by inner class
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World inner class");
            }
        };
        innerClassGreeting.perform();

        // Lambda Expression
        Greeting greetingFunction = () -> System.out.println("Hello World Lambda expression");
        greetingFunction.perform();

        // Lambda Expression
        MyAdd addFunction = (a, b) -> a + b;
        System.out.println(addFunction.add(8,12));

        //Lambda Type inference
        greeter.greet(() -> System.out.println("Hello World Lambda expression type inference"));

    }
}


interface MyAdd{
    int add(int a, int b);
}
