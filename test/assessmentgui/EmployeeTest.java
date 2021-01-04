/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentgui;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEmployeetGender method, of class Employee.
     */
    @Test
    public void testGetEmployeetGender() {
        System.out.println("getEmployeetGender");
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        String expResult = "Male";
        String result = instance.getEmployeetGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeetGender method, of class Employee.
     */
    @Test
    public void testSetEmployeetGender() {
        System.out.println("setEmployeetGender");
        String employeetGender = "Male";
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        instance.setEmployeetGender(employeetGender);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeId method, of class Employee.
     */
    @Test
    public void testGetEmployeeId() {
        System.out.println("getEmployeeId");
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        String expResult = "1";
        String result = instance.getEmployeeId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeeId method, of class Employee.
     */
    @Test
    public void testSetEmployeeId() {
        System.out.println("setEmployeeId");
        String employeeId = "1";
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        instance.setEmployeeId(employeeId);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeName method, of class Employee.
     */
    @Test
    public void testGetEmployeeName() {
        System.out.println("getEmployeeName");
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        String expResult = "Lukasz";
        String result = instance.getEmployeeName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeeName method, of class Employee.
     */
    @Test
    public void testSetEmployeeName() {
        System.out.println("setEmployeeName");
        String employeeName = "Lukasz";
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        instance.setEmployeeName(employeeName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeSurname method, of class Employee.
     */
    @Test
    public void testGetEmployeeSurname() {
        System.out.println("getEmployeeSurname");
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        String expResult = "Szmulk";
        String result = instance.getEmployeeSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeeSurname method, of class Employee.
     */
    @Test
    public void testSetEmployeeSurname() {
        System.out.println("setEmployeeSurname");
        String employeeSurname = "Szmulk";
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        instance.setEmployeeSurname(employeeSurname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeetAge method, of class Employee.
     */
    @Test
    public void testGetEmployeetAge() {
        System.out.println("getEmployeetAge");
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        String expResult = "37";
        String result = instance.getEmployeetAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeetAge method, of class Employee.
     */
    @Test
    public void testSetEmployeetAge() {
        System.out.println("setEmployeetAge");
        String employeetAge = "37";
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        instance.setEmployeetAge(employeetAge);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeHolRemaining method, of class Employee.
     */
    @Test
    public void testGetEmployeeHolRemaining() {
        System.out.println("getEmployeeHolRemaining");
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        int expResult = 25;
        int result = instance.getEmployeeHolRemaining();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeeHolRemaining method, of class Employee.
     */
    @Test
    public void testSetEmployeeHolRemaining() {
        System.out.println("setEmployeeHolRemaining");
        int employeeHolRemaining = 25;
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        instance.setEmployeeHolRemaining(employeeHolRemaining);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeHolRequested method, of class Employee.
     */
    @Test
    public void testGetEmployeeHolRequested() {
        System.out.println("getEmployeeHolRequested");
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        int expResult = 0;
        int result = instance.getEmployeeHolRequested();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeeHolRequested method, of class Employee.
     */
    @Test
    public void testSetEmployeeHolRequested() {
        System.out.println("setEmployeeHolRequested");
        int employeeHolRequested = 0;
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        instance.setEmployeeHolRequested(employeeHolRequested);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateHolidaysData method, of class Employee.
     */
    @Test
    public void testUpdateHolidaysData() {
        System.out.println("updateHolidaysData");
        int holidaysRequestedIntVal = 5;
      
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        instance.setEmployeeHolRemaining(instance.getEmployeeHolRemaining() - holidaysRequestedIntVal);

        instance.setEmployeeHolRequested(instance.getEmployeeHolRequested() + holidaysRequestedIntVal);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of validateHolidayRequest method, of class Employee.
     */
    @Test
    public void testValidateHolidayRequest() throws Exception {
        System.out.println("validateHolidayRequest");
        int holidayReqyest = 5;
        Employee instance = new Employee("1", "Lukasz", "Szmulk", "37", "Male", 25, 0);
        boolean expResult = true;
        boolean result = instance.validateHolidayRequest(holidayReqyest);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
