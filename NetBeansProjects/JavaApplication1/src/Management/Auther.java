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
public class Auther {
    
  
	private int id;
	private String name;
	private String email;
	
	public void setId(int id){
		this.id=id;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getEmail(){
		return email;
	}
        
        
}

   interface BasicOp {
    
     


       abstract void borrow(Patron p, Book_Management b);
   
   
       abstract void returnBook(Patron p,Book_Management  b);
       
       
       abstract void fine(Patron p, int amount); 

}


    

