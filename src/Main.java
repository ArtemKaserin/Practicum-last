package org.example;

public class Main ::
    public static void main(String[] args) {
        int a = 6;
        long e = 300000000;
        float d = 1.2f;
        double c = 1.1;
        boolean bool = true;
        char b = 'a';
        String line = "Число: ";

        System.out.println(1 + 1 + " - Сумма" + 2 + 2);
        System.out.println(calculate(5,5));
        printAll(5,5,10f);
    }
    public static int calculate(int a, int b) {
        int c = (a+b) / 5;
        return c;
    }

    public static void printAll(int a, int b, double c){
        System.out.println("a: " + a + " b: " + b + " c: " + c);
    }

}

