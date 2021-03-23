package design;
import java.util.ArrayList;
public interface Employee extends employeeDatabase{
    public static void main(String[] args) {

    }
	
	/*
	Employee is an Interface which contains multiple unimplemented methods.
	A few methods have been declared below. You need to come up with more methods to meet business requirements of this
	    application
	*/

    /*
     Please read the following methods and understand the business requirements of these following methods
        and then implement these in a concrete class.
     */

    // employeeId() will return employee id.
    public int employeeId();

    //employeeName() will return employee name
    public String employeeName();

    //assignDepartment() will assign employee to departments
   public void assignDepartment();

    //calculate employee salary
    public int calculateSalary();

    //employee benefit
    public void benefitLayout();

    //assignComputer() will assign employee to a computer
    public void assignComputer();

    //assignManager() will assign employee to a manager
    public void assignManager();

    //employeeAddress(); will look at employee's present location to see if relocation is needed
    public void employeeAddress();

    //employeeJobRole(); will assign the employee a role in his Department'
    public void employeeJobRole();

    public void printEmployeeInfo();
}

    //Interface inside a Interface
    interface employeeDatabase{

        //employeeDatabase Interface's variables
        String employeeResume="2 pages required";
        boolean isUnemployeed=true;
        int daysSinceUnemployeed=23;
        double previousMonthlyWage=1000.67;
        char employeeGender='m';


        //Methods
        void criminalRecord();
        void reasonForLeavingPreviousJob();
        void goalsIn5Years();
        void questionsInMind();

}
        //Company's HR has an interface
        interface companyHR{

        //Variables
            String internalDetails="Full review";
            long hrContactNumber=222-444-5555;

         //Methods
         void netWorkInfo();
         void houseOfAvailability();
         void idDetails();







        }