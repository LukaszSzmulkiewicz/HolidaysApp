/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentgui;

/**
 *
 * @author User
 */

// class extending the exception class
class InvalidHolidaysException extends Exception{
    
    
    // clas constructor 
     public InvalidHolidaysException(String string) {
        super(string);
    }
    
}
