package org.example;

/**
 * Hello world!
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(checkIfInputIsAnEvenNumber(22));
        testTrigger();
    }

    public static boolean checkIfInputIsAnEvenNumber(int number) {
        return number % 2 == 0;
    }

    public static void testTrigger() {
        System.out.println("testTrigger...");
    }
}
