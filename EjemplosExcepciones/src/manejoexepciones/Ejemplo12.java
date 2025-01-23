/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoexepciones;

import java.util.InputMismatchException;
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
        int contador = 0;
        System.out.println("Ingrese cuantas operaciones quiere realizar");
        int valor = entrada.nextInt();
        int[] resultados = new int[valor];

        while (contador < resultados.length) {
            try {
                System.out.println("Ingrese valor 1:");
                int valor1 = entrada.nextInt();
                System.out.println("Ingrese valor 2:");
                int valor2 = entrada.nextInt();
                int resultado = valor1 / valor2;
                //System.out.println(resultado);
                resultados[contador] = resultado;
                /*
                se pone el contador al final ya que asumimos que todo lo anterior
                esta bien y podemos pasar a la siguiente posicion
                */
                contador = contador + 1;

            } catch (ArithmeticException e) {
                System.out.printf("(ArithmeticException) Ocurrió una "
                        + "excepción %s\n", e);
            } catch (InputMismatchException e) {
                System.out.printf("(InputMismatchException) Ocurrió una "
                        + "excepción %s\n", e);
                entrada.nextLine();
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
                entrada.nextLine();
            }
        }
        System.out.println("RESULTADOS");
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }

    }
}
