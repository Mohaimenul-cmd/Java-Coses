/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LooL;





    
    
    
    package start;

import java.util.Scanner;

import books.Book;
import students.Student;
import teachers.Teacher;

public class Start {

    private Student student = new Student();
    private Teacher teacher = new Teacher();
    private Book book = new Book();

    public Start() {

        int choise = -1;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Student Management");
            System.out.println("2. Teacher Management");
            System.out.println("3. Book Management");
            System.out.println("4. Basic Operations");
            System.out.println("5. Exit");
            System.out.print("Enter a Option: ");

            choise = input.nextInt();

            switch (choise) {
                case 5:
                    input.close();
                    return;

                case 1:
                    // Student Management
                    this.student.studentStart();
                    break;

                case 2:
                    // Teacher Management
                    this.teacher.teacherStart();
                    break;

                case 3:
                    // Book Management
                    this.book.bookStart();
                    break;

                case 4:
                    // Basic Operations
                    break;

                default:
                    System.out.println("\nWrong Option!!\n");
                    break;
            }

           
        }
    }

    public static void main(String[] args) {
        new Start();
    }
}
    
}
