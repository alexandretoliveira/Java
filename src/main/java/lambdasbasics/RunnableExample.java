public class RunnableExample {

    public static void main(String[] args){
        //Anonymous inner class
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside a Runnable");
            }
        });
        myThread.run();

        Thread myLambdaThread = new Thread(()->System.out.println("Printed inside a lambda runnable"));
        myLambdaThread.run();
    }
}
