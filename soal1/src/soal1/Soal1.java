/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;
import java.util.Scanner;
/**
 *
 * @author FARIHATU
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi1: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi2: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi3: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan warna: ");
        String color = input.next();

        System.out.print("Apakah segitiga terisi (true/false): ");
        boolean filled = input.nextBoolean();

        segitiga segitiga = new segitiga(side1, side2, side3);
        segitiga.setColor(color);
        segitiga.setFilled(filled);

        System.out.println("==============================================");
        System.out.print("Jadi luas segitiga nya adalah: " + segitiga.getArea());
        System.out.println(", Keliling segitiga nya: " + segitiga.getPerimeter());
        System.out.println("Sedangkan Warna segitiga nya: " + segitiga.getColor());
        System.out.println("dan Apakah segitiga terisi?: " + segitiga.isFilled());
        System.out.println(segitiga.toString());
    }
    
}
