/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G45;
import java.util.SaveData;
/**
 *
 * @author mahad
 */
public class Groceries {
    
  

    
    String ItemName;
    int Stock;
    int Size;
    double Price;
    
    Groceries()
    {
        
    }
    
    Groceries(String n, int s1, int s2, double p)
    {    
        setItemName(n);   
        setStock(s1);
        setSize(s2);
        setPrice( p);
    }
    
    void setItemName(String i)
    {
        ItemName = i;
    }
    
    void setStock(int s1)
    {
        Stock = s1;
    }
    
    void setSize(int s2)
    {
        Size = s2;
    }
    
    void setPrice(double p)
    {
        Price = p;
    }

 

}

 


    
}
