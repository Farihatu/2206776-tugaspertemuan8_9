/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal.pkg2;

/**
 *
 * @author FARIHATU
 */
public class Student extends Person {
    public static final String MABA = "Mahasiswa Baru";
    public static final String MATAKE = "Mahasiswa Tahun Kedua";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String status;

    public Student(String nama, String alamat, String noTelepon, String email, String status) {
        super(nama, alamat, noTelepon, email);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student: " + super.toString() + " (Status: " + status + ")";
    }
}