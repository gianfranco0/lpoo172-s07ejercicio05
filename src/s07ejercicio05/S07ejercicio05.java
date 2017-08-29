/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio05;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando objeto Scanner
        Scanner input = new Scanner(System.in);
        
        //Mostrar mensaje al usuario
        System.out.print("Ingrese la cantidad de agua en kilogramos:  ");
        double kilogramos = input.nextDouble();
        
        System.out.print("Ingrese la temperatura inicial:  ");
        double temperaturainicial = input.nextDouble();
        
        System.out.print("Ingrese la temperatura final:   ");
        double temperaturafinal = input.nextDouble();
        
        //Calculando la energia
        double energia = kilogramos * (temperaturafinal - temperaturainicial)*4184;
        
        //Mostrando el resultado
        System.out.println("La energia requerida es: " +energia+ " julies" );
    }
}
