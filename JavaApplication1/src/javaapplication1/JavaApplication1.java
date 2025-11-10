/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseFacultyModule courseModule = new CourseFacultyModule();
        
        int choice;
        do {
            System.out.println("\n===== Smart Campus Assistant =====");
            System.out.println("1. Course / Faculty Module");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1 -> courseModule.showMenu();
                case 2 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 2);
    }
}

 *
 * @author ahnafrabbani
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
