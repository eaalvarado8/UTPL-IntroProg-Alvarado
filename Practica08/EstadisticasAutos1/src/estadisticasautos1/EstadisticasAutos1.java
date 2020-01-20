/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadisticasautos1;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EstadisticasAutos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File archivo = new File("C:/Users/Usuario/UTPL-IntroProg-Alvarado/Practica08/GuardarAutos1/data/Autos1.txt");
            Scanner f = new Scanner(archivo);
            String[] vehiculo;
            int c = 0, c1 = 0;
            ArrayList<String> marca = new ArrayList();
            ArrayList<String> placa = new ArrayList();
            ArrayList<String> modelo = new ArrayList();
            ArrayList<String> anio = new ArrayList();
            ArrayList<String> cilindraje = new ArrayList();
            while (f.hasNextLine()) {
                vehiculo = f.nextLine().split(",");
                marca.add(vehiculo[0]);
                placa.add(vehiculo[1]);
                modelo.add((vehiculo[2]));
                anio.add((vehiculo[3]));
                cilindraje.add((vehiculo[4]));
            }
            f.close();
            for (int i = 0; i <= marca.size() - 1; i++) {
                c++;
                if(vehiculo[0]("Kia")){
                    c1++;
                }
            }
            System.out.println(c + " " +c1);
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

}
