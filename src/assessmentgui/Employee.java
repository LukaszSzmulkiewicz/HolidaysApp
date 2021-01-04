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
// employee class, it extends the holidays interface 
class Employee implements Holidays
{
    // declare variables 
    private String employeeId;
    private String employeeName;
    private String employeeSurname;
    private String employeetAge;
     private String employeetGender;
    private int employeeHolRemaining;
    private int employeeHolRequested;
    
    
    // Constructors
    public Employee(){}

    public Employee(String employeeId, String employeeName, String employeeSurname, String employeetAge, String employeetGender, int employeeHolRemaining, int employeeHolRequested) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSurname = employeeSurname;
        this.employeetAge = employeetAge;
        this.employeetGender = employeetGender;
        this.employeeHolRemaining = employeeHolRemaining;
        this.employeeHolRequested = employeeHolRequested;
    }
    
     // getters and setters
    public String getEmployeetGender() {
        return employeetGender;
    }

    public void setEmployeetGender(String employeetGender) {
        this.employeetGender = employeetGender;
    }
    
   

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeSurname() {
        return employeeSurname;
    }

    public void setEmployeeSurname(String employeeSurname) {
        this.employeeSurname = employeeSurname;
    }

    public String getEmployeetAge() {
        return employeetAge;
    }

    public void setEmployeetAge(String employeetAge) {
        this.employeetAge = employeetAge;
    }

    public int getEmployeeHolRemaining() {
        return employeeHolRemaining;
    }

    public void setEmployeeHolRemaining(int employeeHolRemaining) {
        this.employeeHolRemaining = employeeHolRemaining;
    }

    public int getEmployeeHolRequested() {
        return employeeHolRequested;
    }

    public void setEmployeeHolRequested(int employeeHolRequested) {
        this.employeeHolRequested = employeeHolRequested;
    }
    
    
// overridden interface method for updating the holiday details after the request had been granted
    @Override
        public void updateHolidaysData(int holidaysRequestedIntVal) {

        this.setEmployeeHolRemaining(this.getEmployeeHolRemaining() - holidaysRequestedIntVal);

        this.setEmployeeHolRequested(this.getEmployeeHolRequested() + holidaysRequestedIntVal);

    }
    // method to validate the holiday request, it throws the required Exception   
    @Override
    public boolean validateHolidayRequest(int holidayReqyest) throws InvalidHolidaysException{
        boolean result = false;
        // checking the request against the holiday remaining 
        if (holidayReqyest<= this.employeeHolRemaining){
           
        result = true;
        
        }else{
         throw new InvalidHolidaysException("This holiday request can not be authorised");
          
        }
       
      
       return result;
       
  }
    }

   
    
    


    
    
    