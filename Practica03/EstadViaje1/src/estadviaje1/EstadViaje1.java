/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadviaje1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EstadViaje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        float kmr, kmam, g_csm, glnaltr, rdm_auto, vlc_aut, durac_vjeph, hramin;
        System.out.print("Ingrese los Km recorridos: ");
        kmr = sc.nextFloat();
        System.out.print("Ingrese la duración del viaje en horas: ");
        durac_vjeph = sc.nextFloat();
        System.out.print("Ingrese los galones consumidos: ");
        g_csm = sc.nextFloat();
        glnaltr = (float) (g_csm * 3.785);
        rdm_auto = (kmr / glnaltr );
        hramin = durac_vjeph * 3600;
        kmam = kmr * 1000;
        vlc_aut = kmam / hramin;
        System.out.println("El rendimiento del auto en Km/lt fue de: " + rdm_auto);
        System.out.println("La velocidad media del viaje fue de: " + vlc_aut + "m/s");
    }
}
