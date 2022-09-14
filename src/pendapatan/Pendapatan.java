/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pendapatan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Pendapatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama;
        String daftar;
        System.out.println("Masukkan nama anda:");
        nama= in.nextLine();
        System.out.println("Masukkan jalur pendaftaran dengan golongan pendapatan:");
        daftar= in.nextLine();
        
        switch(daftar){
            case "SBMPTN A":
                System.out.println("Yth. "+nama+" DSP anda adalah Rp5.000.000 dan anda SPP adalah Rp500.000");
                break;
            case "SBMPTN B":
                System.out.println("Yth. "+nama+" DSP anda adalah Rp15.000.000 dan anda SPP adalah Rp1.000.000");
                break;
            case "SBMPTN C":
                System.out.println("Yth. "+nama+" DSP anda adalah Rp30.000.000 dan anda SPP adalah Rp2.000.000");
                break;
            case "SNMPTN A":
                System.out.println("Yth. "+nama+" DSP anda adalah Rp7.000.000 dan anda SPP adalah Rp500.000");
                break;    
            case "SNMPTN B":
                System.out.println("Yth. "+nama+" DSP anda adalah Rp17.000.000 dan anda SPP adalah Rp1.000.000");
                break;
            case "SNMPTN C":
                System.out.println("Yth. "+nama+" DSP anda adalah Rp35.000.000 dan anda SPP adalah Rp2.000.000");
                break;
            case "MANDIRI A":
                System.out.println("Yth. "+nama+" DSP anda adalah Rp10.000.000 dan anda SPP adalah Rp1.000.000");
                break;
            case "MANDIRI B":
                System.out.println("Yth. "+nama+" DSP anda adalah Rp25.000.000 dan anda SPP adalah Rp2.000.000");
                break;    
            case "MANDIRI C":
                System.out.println("Yth. "+nama+" DSP anda adalah Rp50.000.000 dan anda SPP adalah Rp3.000.000");
                break;    
        }
    }
    
}
