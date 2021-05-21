/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Management;


public class Patron {
    
    
   
	public  int id;
        public String name;
	public String departmentName;
	public String email;
	public String contactNo;
	public String address;
	public double amount;
	
       
            
    public void setId(int id){
	    this.id=id;
    }
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setDepartmentName(String departmentName){
		this.departmentName=departmentName;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public void setContactno(String contactNo){
		this.contactNo=contactNo;
	}
	
	public void setAddress(String address){
		this.address=address;
	}
	
	public void setAmount(int amount){
		this.amount=amount;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDepartmentName(){
		return departmentName;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getContactNo(){
		return contactNo;
	}
	
	public String getAddress(){
		return address;
	}
	
	public double getAmount(){
		return amount;
	}
	
}
        
        
	

