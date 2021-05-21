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
public class Teacher extends Patron{
    
    
    
	private String teacherId;
	
	public void setTeacherId(String teacherId){
		this.teacherId=teacherId;
	}
	
	public String getTeacherId(){
		return teacherId;
	}
}

