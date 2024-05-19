/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.pkg2;

/**
 *
 * @author FARIHATU
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Main.java
        MyDate hireDate = new MyDate(2020, 5, 15);

        Person person = new Person("Yusuf Mansyur", "Jl. Merdeka 123", "081234567890", "yusufm@gmail.com");
        Student student = new Student("Zakaria", "Jl. Diponegoro 456", "081298765432", "zakaria@gmail.com", Student.MABA);
        Employee employee = new Employee("Nur Amelia", "Jl. Beringin 789", "081234567891", "amelia@gmail.com", "Kantor A123", 50000, hireDate);
        Faculty faculty = new Faculty("Hamdi Safei", "Jl. Cemara 101", "081234567892", "hamdis@gmail.com", "Kantor B456", 60000, hireDate, 10, "Profesor");
        Staff staff = new Staff("Dzakwan Atoriq", "Jl. Pinus 222", "081234567893", "dzakwan@gmail.com", "Kantor C789", 40000, hireDate, "Asisten");

        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
    }
}