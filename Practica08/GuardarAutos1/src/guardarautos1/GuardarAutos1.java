/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guardarautos1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class GuardarAutos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca, placa, modelo, litros, anio;
        int n;
        try {
            PrintWriter pw = new PrintWriter("data/Autos1.txt");
            System.out.print("¿Cuántos vehiculos desea ingresar? ");
            n = sc.nextInt();
            sc.nextLine();
            for (int i = 1; i <= n; i++) {
                System.out.print("Placa vehiculo " + i + ": ");
                placa = sc.nextLine();
                System.out.print("Marca vehiculo " + i + ": ");
                marca = sc.nextLine();
                System.out.print("Modelo vehiculo " + i + ": ");
                modelo = sc.nextLine();
                System.out.print("Año vehiculo " + i + ": ");
                anio = sc.nextLine();
                System.out.print("Litros vehiculo " + i + ": ");
                litros = sc.nextLine();
                pw.println(marca + "," + placa + "," + modelo + "," + anio 
                        + "," + litros);
            }
            pw.close();
        } catch (Exception e) {
            System.err.println("ERROR:\n" + e.toString());
        }

    }

}
    
