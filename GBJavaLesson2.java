/*
* Java 1. Homework #2
*
* @author Elmira Arslanova
* @version 13.12.2021
*
*/
class GBJavaLesson2 {
    public static void main(String[] args) {
        System.out.println(checkSumSign(1, 5));
        checkNumbSign(0);
        System.out.println(checkNumbSignConv(10));
        printRepeatWorld("wow", 5);
    }

    static boolean checkSumSign(int a, int b) {
        return a+b>10 && a+b<=20;
    }

    static void checkNumbSign(int a) {
        System.out.println(a>=0? "pozitive":"negative");
    }

    static boolean checkNumbSignConv(int a) {
        return a<0;
    }

    static void printRepeatWorld(String a, int b) {
        for (int i=0; i<b; i++) {
             System.out.println(a);
        }
    }

}
