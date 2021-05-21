/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G45;

/**
 *
 * @author mahad
 */
import java.util.Scanner;


class SaveData{
    
    SaveData()
    {
        
    }
    public void writeData(String s) 
    {
        try
        {
            File file = new File("History.txt");
            file.createNewFile();
            FileWriter writer = new FileWriter(file,true);
            writer.write(s+"\r"+"\n");
            writer.flush();
            writer.close();   
        }
        
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    
    public void readData() 
    {
        try
        {
            File file = new File("History.txt");
            FileReader reader = new FileReader(file);
            BufferedReader bfr = new BufferedReader(reader);
            String text ="",temp;
            while((temp = bfr.readLine())!=null)
            {
                text = text+temp+"\n"+"\r";             
            }
            System.out.println(text);
            reader.close();
               
        }
        
        catch(IOException ioe)
        {
            ioe.printStackTrace();
        }
    }
    
    
}

 

 


    
