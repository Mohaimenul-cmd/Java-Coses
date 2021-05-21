/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New;

import java.io.IOException;


public interface BasicOperation {
    
    void borrow(Patron p, Book b) throws IOException;
    void returnBook(Patron p, Book b);
    void fine(Patron p, double amount) throws IOException;
}
    

