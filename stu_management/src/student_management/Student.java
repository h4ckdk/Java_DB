package student_management;

import java.sql.SQLException;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
    int id;
    String name;
    String department;


    Student() throws SQLException {
        System.out.print("enter your id :");
        id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("enter your name :");
        name = scanner.nextLine();


        System.out.print("enter your department :");
        department = scanner.nextLine();

    }
}
