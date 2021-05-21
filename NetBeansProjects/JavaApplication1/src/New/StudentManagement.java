/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;


    
    
    import java.io.*;

import java.util.Scanner;

public class StudentManagement {
    Student students[] = new Student[10];
    int size =0;
    void insertStudent(Student s) throws IOException {
        students[size] = s;
        size++;
        PrintWriter pw = new PrintWriter(s.getStudentId()+".txt");
        FileWriter fw = new FileWriter(s.getStudentId()+".txt", false);
        fw.write("Name: "+s.getName()+"\n");
        fw.write("Id: "+s.getStudentId()+"\n");
        fw.write("Guardian Name: "+s.getGuardianName()+"\n");
        fw.write("Guardian Contact: "+s.getGuardianContactNo()+"\n");
        fw.close();
        pw.close();
    }
    void removeStudent(Student s){
        for(int i=0;i<size;i++){
            if(students[i].equals(s)){
                students[i]=null;
                break;
            }
        }
    }
    Student getStudent(int studentId){
        String stId = studentId+"";
        for(int i=0;i<size;i++){
            if(students[i].getStudentId().equals(null))
                continue;
            if(students[i].getStudentId().equals(stId))
                return students[i];
        }
        System.out.println("Student does not exists");
        return null;
    }
    void showAllStudents(){
        for(int i=0;i<size;i++){
            if(students[i].equals(null))
                continue;
            students[i].showInfo();
        }
    }
}


