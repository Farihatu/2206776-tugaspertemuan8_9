/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal.pkg2;

/**
 *
 * @author FARIHATU
 */
public class Employee extends Person {
    private String kantor;
    private double gaji;
    private MyDate tanggalDipekerjakan;

    public Employee(String nama, String alamat, String noTelepon, String email,
                    String kantor, double gaji, MyDate tanggalDipekerjakan) {
        super(nama, alamat, noTelepon, email);
        this.kantor = kantor;
        this.gaji = gaji;
        this.tanggalDipekerjakan = tanggalDipekerjakan;
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString() + " (Kantor: " + kantor +
                ", Gaji: " + gaji + ", Tanggal Dipekerjakan: " + tanggalDipekerjakan + ")";
    }
}