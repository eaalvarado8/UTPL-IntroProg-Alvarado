package paises1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Paises1 {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            File archivo = new File("data/Paises.txt");
            Scanner f = new Scanner(archivo);
            String[] paises;
            ArrayList<String> pais = new ArrayList();
            ArrayList<String> codigo = new ArrayList();
            ArrayList<Integer> poblacion = new ArrayList();
            ArrayList<Double> superficie = new ArrayList();
            while (f.hasNextLine()) {
                paises = f.nextLine().split(":");
                pais.add(paises[0]);
                codigo.add(paises[1]);
                poblacion.add(Integer.parseInt(paises[2]));
                superficie.add(Double.parseDouble(paises[3]));
            }
            f.close();
            double den[] = new double[pais.size()];
            for (int i = 0; i < pais.size(); i++) {
                den[i] = poblacion.get(i) / superficie.get(i);
            }
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("|                           PAISES MAS POBLADOS                                 |");
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println("| Nombre                                             | Codigo   |  Densidad     |");
            System.out.println("---------------------------------------------------------------------------------");
            for (int i = 0; i <= poblacion.size() - 1; i++) {
                if (den[i] > 1000) {
                    System.out.printf("| %-50s | %-8s | %-13.2f |%n", pais.get(i), codigo.get(i), den[i]);
                }
            }
            System.out.println("---------------------------------------------------------------------------------");
        } catch (Exception e) {
            System.err.println("\n ERROR:Dato Invalido " + e.getMessage());
        }
    }
}
