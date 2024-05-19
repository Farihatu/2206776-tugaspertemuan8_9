/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal.pkg2;

/**
 *
 * @author FARIHATU
 */
public class Faculty extends Employee {
    private int jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String noTelepon, String email,
                   String kantor, double gaji, MyDate tanggalDipekerjakan, int jamKerja, String pangkat) {
        super(nama, alamat, noTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Faculty: " + super.toString() + " (Pangkat: " + pangkat + ", Jam Kerja: " + jamKerja + ")";
    }
}