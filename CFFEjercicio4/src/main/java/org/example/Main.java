package org.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Se le pide al usuario un número entero y se imprime la suma de sus dígitos
        System.out.println("Introduce un número cuyos dígitos serán sumados individualmente:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumaDigitos(n));
    }

    // Método que suma los dígitos de un número entero
    public static int sumaDigitos(int n) {
        if (n == 0){
            return 0;
        } else {
            return n % 10 + sumaDigitos(n / 10);
        }
    }
}