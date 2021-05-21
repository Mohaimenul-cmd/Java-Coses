/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;


 
public class Book {
    
   
   
    int id;
    String title, subtitle;
    Author author;
    Publisher publisher;
    double price;
    void setBookId(int id){
        this.id = id;
    }
    void setTitle(String title){
        this.title = title;
    }
    void setSubTitle(String subtitle){
        this.subtitle = subtitle;
    }
    void setAuthor(Author author){
        this.author = author;
    }
    void setPublisher(Publisher publisher){
        this.publisher = publisher;
    }
    void setPrice(double price){
        this.price = price;
    }
    int getBookId(){
        return id;
    }
    String getTitle(){
        return title;
    }
    String getSubtitle(){
        return subtitle;
    }
    Author getAuthor(){
        return author;
    }
    Publisher getPublisher(){
        return publisher;
    }
    double getPrice(){
     return price;
    
    }
    
    void showInfo(){
        
        System.out.println("Title: "+ getTitle());
        System.out.println("Id: "+ getBookId());
        System.out.println("Author: "+ author.getName());
        System.out.println("Publisher: "+ publisher.getName());
        System.out.println("Price: "+ price+"\n");
    }
}
    

