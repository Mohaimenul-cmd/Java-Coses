/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

  import java.io.*;


public class BookManagement {
    
  

    Book books[] = new Book[10];
    int size = 0;
    void insertBook(Book b) throws Io.expression {
        books[size] = b;
        size++;
        PrintWriter pw = new PrintWriter(b.getBookId()+".txt");
        FileWriter fw = new FileWriter(b.getBookId()+".txt", false);
        fw.write("Title: "+b.getTitle()+"\n");
        fw.write("Subtitle: "+b.getSubtitle()+"\n");
        fw.write("Subtitle: "+b.getSubtitle()+"\n");
        fw.write("Author: "+b.getAuthor().getName()+"\n");
        fw.write("Publisher: "+b.getPublisher().getName()+"\n");
        fw.close();
        pw.close();
    }
    Book getBook(int bookId){
        for(int i=0;i<size;i++){
            if(books[i].getBookId()==0)
                continue;
            if(books[i].getBookId()==bookId)
                return books[i];
        }
        System.out.println("Book does not exists");
        return null;
    }
    void showAllBooks(){
        for(int i=0;i<size;i++){
            if(books[i]==null)
                continue;
            books[i].showInfo();
        }
    }
}
    

