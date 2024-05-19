/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal.pkg2;

/**
 *
 * @author FARIHATU
 */
public class Person {
    private String nama;
    private String alamat;
    private String noTelepon;
    private String email;

    public Person(String nama, String alamat, String noTelepon, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person: " + nama;
    }
}
