/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student_management;

import Management.Patron;

/**
 *
 */

    
    public class Student extends Patron{
        
        
	private String studentId;
	private String guardianName;
	private String guardianContactNo;
	
	public void setStudentId(String studentId){
		this.studentId=studentId;
	}
	
	public void setGuardianName(String guardianName){
		this.guardianName=guardianName;
	}
	
	public void setGuardianContactNo(String guardianContactNo){
		this.guardianContactNo=guardianContactNo;
	}
	
	public String getStudentId(){
		return studentId;
	}
	
	public  String getGuardianName(){
		return guardianName;
	}
	
	public String getGuardianContactNo(){
		return guardianContactNo;
	}
	
}
    
    
    
   
    
    
   

   

