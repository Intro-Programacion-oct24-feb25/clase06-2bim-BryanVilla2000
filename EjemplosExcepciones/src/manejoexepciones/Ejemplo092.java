/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
un ciclo repetitivo que me pida un nombre de pais
si e ingresa un nombre que empiece con una vocal sigo en el ciclo caso contrario
me de una exepcion
 */
package manejoexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo092 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            try {
                System.out.println("ingrese el nombre de un pais");
                String pais = entrada.nextLine();
                pais = pais.toLowerCase();
                char inicial = pais.charAt(0);
                if (inicial != 'a' && inicial != 'e' && inicial != 'i'
                        && inicial != 'o' && inicial != 'u') {
                    
                    bandera = false;
                    throw new Exception("debe empezar con un vocal");
                    
                }

                System.out.printf("Resultado %s\n", pais);
            } catch (Exception e) {
                System.out.printf("Ocurrió una excepción %s\n", e);
            }
        }
    }
}
