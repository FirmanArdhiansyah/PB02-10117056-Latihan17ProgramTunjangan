
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nama : Firman Ardhiansyah 
 *         Kelas : IF-02 (PB02)
 *         NIM : 10117056
 * deskripsi : Program ini berisi program untuk menampilkan tunjangan dan total
 * gaji
 */
public class PB0210117056Latihan17ProgramTunjangan {

    public static void main(String[] args) {
        //write your code here

        double gajiPokok;
        double tunjangan;
        String status;
        double totalGaji;

        Scanner scan = new Scanner(System.in);

        System.out.println("=========Program Tunjangan==========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        gajiPokok = scan.nextDouble();
        System.out.print("Status Anda ? (Menikah/Belum)\t: ");
        status = scan.next();

        System.out.println("\n" + "======Hasil Perhitungan Gaji Anda=======");
        System.out.println("Gaji Pokok\t\t: Rp. " + gajiPokok);

        //tunjangan
        if (status.equals("Menikah")) {
            tunjangan = 0.35 * gajiPokok;
        } else {
            tunjangan = 0;
        }
        System.out.println("Tunjangan\t\t: Rp. " + tunjangan);
        //totalgaji
        totalGaji = gajiPokok + tunjangan;
        System.out.println("Total gaji\t\t: Rp. " + totalGaji);
        System.out.println("Developed By : Firman Ardhiansyah");

    }

}


