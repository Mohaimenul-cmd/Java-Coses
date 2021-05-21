/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;

/**
 *
 * @author mahad
 */
public class Book_Management {
    
    
	private int id;
	private String title;
	private String subtitle;
	private String  aurthor;
	private String publisher;
	private  double price;

    public void setId(int id){
        this.id=id;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
	
	public void setSubtitle(String subtitle){
		this.subtitle=subtitle;	
	}

    public void setAuthor(String aurthor){
        this.aurthor=aurthor;
    }
	
	public void setPublisher(String publisher){
		this.publisher=publisher;	
    }
	
	public void setPrice(double price){
		this.price=price;
	}
	
}
 
    
public class Toy implements BasicOp{

    public void borrow(Patron p, Book_Management b){
    
    
    
    
    }
   
   
       public void returnBook(Patron p,Book_Management  b){
       
       
       }
       
       
       public void fine(Patron p, int amount){
       
       
       }


}
