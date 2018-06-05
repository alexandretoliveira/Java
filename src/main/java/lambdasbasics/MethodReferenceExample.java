import java.util.function.Consumer;

public class MethodReferenceExample {

    public static void main(String[] args){
        Thread t = new Thread(MethodReferenceExample::printMessage);  // ()->printMessage()
        t.start();

        String s = "Teste method";
        printMessageWithConsumer(s, System.out::println); //v->System.out.println(v)
    }

    private static void printMessage(){
        System.out.println("Hello!");
    }

    private static void printMessageWithConsumer(String str, Consumer<String> consumer){
        consumer.accept(str);
    }
}
