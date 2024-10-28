package com.campusdual.classroom;

public class Exercise04 {
    public static void main(String[] args) {


        System.out.println("Ejemplos de cálculos SIN estructuras de control:" + (1 + 2 + 3 + 4 + 5));
        System.out.println("Suma de los primeros 5 números: " + sumNum(5));
        System.out.println("Suma de los primeros 20 números pares: " + sumEvenNum(20));
        System.out.println("Obtén el factorial del número 7 → (7!): " + factorial(7));
        System.out.println("######################################################################");
        System.out.println("Ejemplos de cálculos CON estructuras de control: " + recursiveFactorial(7));
        sumNum(5);
        sumEvenNum(20);
        factorial(7);
        recursiveFactorial(7);

    }

    public static int sumNum(int num) {

        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma += i;
        }
        return suma;
    }

    public static int sumEvenNum(int num) {
        int suma2 = 0;

        for (int i = 1; i <= num; i++) {
            suma2 += i * 2;
        }
        return suma2;

    }

    public static int factorial(int num) {
        int factorial1 = 1;
        for (int i = 1; i <= num; i++) {
            factorial1 *= i;
        }
        return factorial1;
    }

    public static int recursiveFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * recursiveFactorial(num - 1);
        }
    }
}
