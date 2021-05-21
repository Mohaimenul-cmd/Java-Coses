/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

/**
 *
 * @author mahad
 */
public class Publisher {
  
    int id;
    String name, contactNo;
    void setId(int id){
        this.id = id;
    }
    void setName(String name){
        this.name = name;
    }
    void setContactNo(String contactNo){
        this.contactNo = contactNo;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
    String getContactNo(){
        return contactNo;
    }
}
    

