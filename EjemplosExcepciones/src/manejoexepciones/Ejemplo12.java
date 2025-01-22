/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.Scanner;

/**
 *
 * @author utpl
 */

/*
    Realizar un proceso repetitivo que permita realizar la división de 
    números ingresados por teclado; el resultado de cada división debe ir 
    almacenandose en cada posición del arreglo. Considerar las excepciones
    posibles
 */
public class Ejemplo12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];
        for (int i = 0; i < resultados.length; i++) {
            boolean repetir = true;
            while (repetir) {
                try {
                    System.out.println("Ingrese valor 1:");
                    int valor1 = entrada.nextInt();
                    System.out.println("Ingrese valor 2:");
                    int valor2 = entrada.nextInt();
                    int resultado = valor1 / valor2;
                    System.out.println(resultado);
                    resultados[i] = resultado;
                    repetir = false;

                } catch (Exception e) {
                    repetir = false;
                    System.out.printf("Ocurrió una excepción %s\n", e);
                }
            }
        }

        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }

    }
}
