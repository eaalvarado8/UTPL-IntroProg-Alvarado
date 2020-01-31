package personas5;
import java.io.*;
import java.util.*;

public class Personas5 {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        try {
            File archivo = new File("data/Personas.txt");
            Scanner f = new Scanner(archivo);
            String[] persona;
            ArrayList<String> nombres = new ArrayList();
            ArrayList<String> generos = new ArrayList();
            ArrayList<Integer> edades = new ArrayList();
            while (f.hasNextLine()) {
                persona = f.nextLine().split(",");
                nombres.add(persona[0]);
                generos.add(persona[1]);
                edades.add(Integer.parseInt(persona[2]));
            }
            
            f.close();
            int suma = 0, cf = 0;
            for (int i = 0; i <= edades.size() - 1; i++) {
                if (edades.get(i) < 0) {
                    throw new Exception("Edad negativa, dato no valido");
                }
                if (generos.get(i).equals("F")) {
                    suma += edades.get(i);
                    cf++;
                }
            }
            double media = (double) suma / cf;
            System.out.println("Promedio: " + media);
            
        } catch (FileNotFoundException e) {
            System.out.println("\nERROR! Archivo no encontrado");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nERROR! Los datos están incompletos");
        } catch (NumberFormatException e) {
            System.out.println("\nERROR! Formato de datos incorrecto");
        } catch (Exception e) {
            System.out.println("\nERROR! " + e.getMessage());
        }
        
    }

}