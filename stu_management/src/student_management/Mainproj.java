package student_management;

import java.sql.SQLException;
import java.util.Scanner;

public class Mainproj {
    public static void main(String[] args) throws SQLException {
        Scanner scanner= new Scanner(System.in);
        //        System.out.println("id is "+obj.id+" name is "+ obj.name+" age is "+obj.age+" carrer is "+ obj.carrer);

        StudentDAO studentDAO = new StudentDAO();

        while(true){
            System.out.println(" ");
            System.out.print("you enter id,names,age please enter a number 1 or you want to show all inside of table enter a number 2 :");
            int num = scanner.nextInt();
            if(num==1) {
                int start = 1;
                while (start == 1) {
                    Student obj = new Student();
                    int res = studentDAO.storeddb(obj.id, obj.name,obj.department);
                    System.out.println("stored " + res);
                    System.out.println(" ");
                    System.out.print("1 is continue and 2 is exit: ");
                    start = scanner.nextInt();
                }
            } else if (num == 2) {

                studentDAO.getdb();
            }
            else{
                System.out.println("you enter wrong number ");
            }
        }

    }
}
