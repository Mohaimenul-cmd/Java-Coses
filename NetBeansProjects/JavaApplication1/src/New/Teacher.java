/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;


    import java.io.*;

public class Teacher extends Patron {
    String teacherId;
    void setTeacherId(String teacherId){
        this.teacherId = teacherId;
    }
    String getTeacherId(){
        return teacherId;
    }
    void showInfo(){
        System.out.println("Name: "+ getName());
        System.out.println("Id: "+ getTeacherId()+"\n");
    }
    public void borrow(Patron p, Book b) throws IOException {
        FileWriter fw = new FileWriter(p.getId()+".txt", false);
        fw.write("Borrowed Books: "+b.getTitle()+" id: "+b.getBookId());
        fw.close();
    }
    public void returnBook(Patron p, Book b){
        System.out.println("Thanks for returing book");
    }
    public void fine(Patron p, double amount) throws IOException {
        FileWriter fw = new FileWriter(p.getId()+".txt", false);
        fw.write("fine: "+amount);
        fw.close();
    }
}

