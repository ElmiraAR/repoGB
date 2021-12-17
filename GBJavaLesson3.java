/*
* Java 1. Homework #3
*
* @author Elmira Arslanova
* @version 16.12.2021-17.12.2021
*
*/
import java.util.Arrays;

class GBJavaLesson3 {
    public static void main(String[] args) {
    invertArr();
    isArr();
    incElemArr();
    isOneDiagonal();
    System.out.println(Arrays.toString(isInitialArr(5,6)));
    isMinMaxArr();
    }

    static void invertArr() {
        int[] a = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(a));
        for (int i=0; i<a.length; i++) {
            if (a[i]==0) {
                a[i]=1;
            } else {
                a[i]=0;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static void isArr() {
        int[] a = new int [100];
        for (int i=0; i<a.length; i++) {
            a[i]=i+1;
        }
        System.out.println(Arrays.toString(a));
    }

    static void incElemArr() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(a));
        for (int i=0; i<a.length; i++) {
            if (a[i]<6) {
                a[i]=a[i]*2;
            } 
        }
        System.out.println(Arrays.toString(a));
    }

    static void isOneDiagonal() {
        int[][] a =  new int [5] [5];
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (i==j || i+j==4) {
                    a[i][j]=1;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int[] isInitialArr(int len, int initialValue) {
        int[] a = new int [len];
        for (int i=0; i<len; i++) {
            a[i]=initialValue;
        }
        return a;
    }

    static void isMinMaxArr() {
        int[] a = {10, 5, 3, 2};
        int min=a[0];
        int max=a[0];
        for (int i=1; i<4; i++) {
            if (a[i]<min) {
                min=a[i];
            }
            if (a[i]>max) {
                max=a[i];
            }
        }
        System.out.println("min element "+ min);
        System.out.println("max element "+ max);
    }

}