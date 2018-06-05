package lambdasbasics;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambdaExample {

    public static void main(String[] args){
        int[] someNumbers = {1,2,4,6,8,9};
        int key = 0;

        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int someNumber : someNumbers) {
            consumer.accept(someNumber, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
        return (v, k) -> {
            try {
                consumer.accept(v, k);
            }
            catch (ArithmeticException e) {
                System.out.println("Exception.");
            }
          };

    }


}
