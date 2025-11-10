package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

public class CourseFacultyModule {

    static class Course {
        String code;
        String name;
        String instructor;

        Course(String code, String name, String instructor) {
            this.code = code;
            this.name = name;
            this.instructor = instructor;
        }
    }

    private ArrayList<Course> courses = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void showMenu() {
        int choice;
        do {
            System.out.println("\n===== Course / Faculty Module =====");
            System.out.println("1. Add New Course");
            System.out.println("2. Search Course by Code");
            System.out.println("3. Search Course by Instructor");
            System.out.println("4. Display All Courses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addCourse();
                case 2 -> searchByCode();
                case 3 -> searchByInstructor();
                case 4 -> displayCourses();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);
    }

    private void addCourse() {
        System.out.print("Enter course code: ");
        String code = sc.nextLine();
        System.out.print("Enter course name: ");
        String name = sc.nextLine();
        System.out.print("Enter instructor name: ");
        String instructor = sc.nextLine();

        courses.add(new Course(code, name, instructor));
        System.out.println("Course added successfully!");
    }

    private void searchByCode() {
        System.out.print("Enter course code to search: ");
        String code = sc.nextLine();
        boolean found = false;
        for (Course c : courses) {
            if (c.code.equalsIgnoreCase(code)) {
                System.out.println("Course found: " + c.code + " - " + c.name + " (" + c.instructor + ")");
                found = true;
            }
        }
        if (!found) System.out.println("Course not found!");
    }

    private void searchByInstructor() {
        System.out.print("Enter instructor name: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Course c : courses) {
            if (c.instructor.equalsIgnoreCase(name)) {
                System.out.println("Course: " + c.code + " - " + c.name);
                found = true;
            }
        }
        if (!found) System.out.println("No courses found for that instructor!");
    }

    private void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            System.out.println("\nAll Courses:");
            for (Course c : courses) {
                System.out.println(c.code + " - " + c.name + " (" + c.instructor + ")");
            }
        }
    }

    public static void main(String[] args) {
        CourseFacultyModule module = new CourseFacultyModule();
        module.showMenu();
    }
}
