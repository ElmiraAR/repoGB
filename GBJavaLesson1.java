/*
* Java 1. Homework #1
*
* @author Elmira Arslanova
* @version 11.12.2021
*
*/
class GBJavaLesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a=-5;
        int b=5;
        System.out.println((a+b>=0) ? "Sum is positive":"Sum is negative");
    }

    static void printColor() {
        int value=0;
        if (value<=0) {
            System.out.println("Red");
        } else if (value<=100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a=1;
        int b=20;
        System.out.println((a>=b) ? "a>=b":"a<b");
    }
}