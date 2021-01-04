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
// holidays interface 
public interface Holidays {
    
    // interface methods
    
    // method to validate the holiday request throwing an exception 
    public boolean validateHolidayRequest(int holidayReqyest) throws InvalidHolidaysException;
    
    // method to update the employee holiday data

    /**
     *
     * @param emp
     * @param holidaysRequestedIntVal
     */
    public void updateHolidaysData(int holidaysRequestedIntVal);
    
}
