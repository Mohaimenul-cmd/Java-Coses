/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;


    import java.io.*;

public class TeacherManagement {
    Teacher teachers[] = new Teacher[10];
    int size =0;
    void insertTeacher(Teacher t) throws IOException{
        teachers[size] = t;
        size++;
        PrintWriter pw = new PrintWriter(t.getTeacherId()+".txt");
        FileWriter fw = new FileWriter(t.getTeacherId()+".txt", false);
        fw.write("Name: "+t.getName()+"\n");
        fw.write("Id: "+t.getTeacherId()+"\n");
        fw.close();
        pw.close();
    }
    Teacher getTeacher(int teacherId){
        String tId = teacherId+"";
        for(int i=0;i<size;i++){
            if(teachers[i].getTeacherId().equals(null))
                continue;
            if(teachers[i].getTeacherId().equals(tId))
                return teachers[i];
        }
        System.out.println("Teacher does not exists");
        return null;
    }
    void showAllTeachers(){
        for(int i=0;i<size;i++){
            if(teachers[i].equals(null))
                continue;
            teachers[i].showInfo();
        }
    }
}
    

