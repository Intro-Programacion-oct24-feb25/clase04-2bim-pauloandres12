/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo081 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // 
        String mensajeSuma = "";

        int opcion;
        int limite;
        int tabla;

        System.out.println("Ingrese la opcion que desea usar");
        opcion = entrada.nextInt();
        System.out.println("Ingrese la tabla que desea usar");
        tabla = entrada.nextInt();
        System.out.println("Ingrese el limite de la tabla que desea usar");
        limite = entrada.nextInt();

        switch (opcion) {
            case 1:
                mensajeSuma = obtenerTablaSumar(limite, tabla);
                break;
            case 2:
                mensajeSuma = obtenerTablaMultiplicar(limite, tabla);
                break;
        }

        // se invoca al método 
        // obtenerTablaSumar
        // y el valor que 
        // devuelve se lo 
        // almacena  en mensajeSuma
        System.out.printf("%s\n", mensajeSuma);
    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;
    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;

    }

}
