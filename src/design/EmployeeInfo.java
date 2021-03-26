package design;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Scanner;

public class EmployeeInfo {

    /*
    This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.

    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        - Use all kind of keywords (super, this, static, final, etc)
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */

    /*
     * Make sure to declare and use static, non-static & final fields
     */

    //Static Variables
    static String companyName;
    static String companyLocation;
    static long companyPhoneNumber;
    static int numberOfYearsWithCompany;
    static int salary;

    //Final Variables
    final String city="Newark";
    final int totalEmployees=500;
    final boolean openOnWeekends= false;


    // non-static variabes
    String companyWebsite="www.DreamWork.com";
    double averageMonthlyPayRole=4000.75;
    boolean isHiring=true;

    //private Variables
    private int employeeAge=34;
    private long employeePhoneNumber;
    private String employeePreviousJob;
    private String dateOfBirth;
    private static conditionFilterType Performance_p;
    private static object obj;
    private static conditionFilterType Performance;

    //Getter
    public static String getCompanyName(){
        return companyName;
    }
    //Setter
    public static  void setCompanyName(String companyName){
        EmployeeInfo.companyName= companyName;
    }
    //Getter
    public int getEmployeeAge(){
        return employeeAge;
    }
    //Setter
    public int setEmployeeAge(int employeeAge){
        this.employeeAge=employeeAge;
        return employeeAge;
    }
    //Getter
    public long getEmployeePhoneNumber(){
        return employeePhoneNumber;
    }
    //Setter
    public void setCompanyPhoneNumber(long employeePhoneNumber){
        this.employeePhoneNumber=employeePhoneNumber;
    }
    //Getter
    public String getEmployeePreviousJob(String employeePreviousJob){
        return employeePreviousJob;
    }
    //Setter
    public void setEmployeePreviousJob(String employeePreviousJob){
        this.employeePreviousJob= employeePreviousJob;
    }
    //Getter
    public String getDateOfBirth;{
        return dateOfBirth;
    }
    // Setter
    public String setDateOfBirth(String dateOfBirth){
        this.dateOfBirth=dateOfBirth;
        return dateOfBirth;
    }


    /*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */
    public void EmployeeResume(){
        System.out.println("Employee has a qualified resume");
    }
    public void EmployeeReferences(){
        System.out.println(" Employee has references with contact details");
    }
    public void EmployeeTravelMethod(){
        System.out.println("Employee travels to work by train");
    }
    public EmployeeInfo(String companyWebsite,int employeeAge,int employeePhoneNumber){
        super("www.dreamworks.com", 4000.76, true,employeeAge,444_434_234);
        this.companyWebsite=companyWebsite;
        this.averageMonthlyPayRole=averageMonthlyPayRole;
        this.isHiring=isHiring;
        this.employeeAge=employeeAge;
        this.employeePhoneNumber=employeePhoneNumber;
    }


    /*
     You must have/use multiple constructors
     */
    public EmployeeInfo(){
        super();
    }
    public void employeeNationality(String nationality){

    }
    public EmployeeInfo(int employeeId) {

    }


    public EmployeeInfo(String name, int employeeId) {

    }
    public EmployeeInfo(String companyWebsite){
        this.companyWebsite=companyWebsite;
    }

    public EmployeeInfo(String companyWebsite, double averageMonthlyPayRole){
        this.companyWebsite=companyWebsite;
        this.averageMonthlyPayRole=averageMonthlyPayRole;
    }

    public EmployeeInfo(String companyWebsite,double averageMonthlyPayRole,boolean isHiring){
        this.companyWebsite=companyWebsite;
        this.averageMonthlyPayRole=averageMonthlyPayRole;
        this.isHiring=isHiring;
    }
    public EmployeeInfo(String companyWebsite, double averageMonthlyPayRole, boolean isHiring, int employeeAge){
        this.companyWebsite=companyWebsite;
        this.averageMonthlyPayRole=averageMonthlyPayRole;
        this.isHiring=isHiring;
        this.employeeAge=employeeAge;
    }
    public EmployeeInfo(String companyWebsite, double averageMonthlyPayRole,boolean isHiring, int employeeAge,int employeePhoneNumber,String employeePreviousJob){
    this.companyWebsite=companyWebsite;
    this.averageMonthlyPayRole=averageMonthlyPayRole;
    this.isHiring=isHiring;
    this.employeeAge=employeeAge;
    this.employeePhoneNumber=employeePhoneNumber;
    this.employeePreviousJob=employeePreviousJob;
    }
    EmployeeInfo ob=new EmployeeInfo();





    /*
     You need to implement the logic of this method as such:
        It should calculate Employee bonus based on salary and performance.
        It should return the total yearly bonus.
            Example: 10% of salary for best performance, 8% of salary for average performance and so on.
            You can set arbitrary number for performance, so you probably need to send 2 arguments.
     *
     */
    public static int calculateEmployeeBonus(int numberOfYearsWithCompany) {
        int total = 0;
        return total;
    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *
     */
    public static int calculateEmployeePension() {
        int total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);

        // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
        // Calculate pension

        return total;
    }

    @Override
    public int employeeID(){
        return 1234;
    }

    @Override
    public String employeeName(){
        return "Employee's Name is: Adam";
    }

    @Override
    public void assignDepartment(){
        System.out.println(" Employee will be assigned to a department");
    }

    public int calculateSalary(){
        Object salary= null;
        return (int) salary;
    }

    @Override
    public void benefitLayout(){
        System.out.println(" Employee will be given benefits for working in the company");
    }
    @Override
    public void assignComputer(){
        System.out.println("Employee will be assigned his cubicle with the computer");
    }

    @Override
    public void assignManager(){
        System.out.println(" Employee will be assigned manager according to his department");
    }

    @Override
    public void employeeAddress(){
        System.out.println(" Employee's address should be provided in resume");
    }

    @Override
    public void employeeJobRole(){
        System.out.println(" Employee will be given a job role in his department");
    }

    @Override
    public void printEmployeeInfo(){
//        EmployeeInfo ei=new EmployeeInfo();


        System.out.println(employeePhoneNumber=231456454);
        System.out.println(dateOfBirth="01-06-1993");
        System.out.println(companyName="Dream Work");
        System.out.println(companyLocation="Delaware");
        System.out.println(companyPhoneNumber=323123212);
        System.out.println(employeePreviousJob="TD bank");
    }

    public void companyUpcomingEvent(){
        System.out.println(" The company will have an upcoming event for 1 year reunion ");
    }

    public void annualPartyDate(String  partyDate){
        System.out.println(" The company will have a party on the date of 01-09-2021");
    }
    //These are the method created inside the employeeDatabase Interface
    //Which was inherited by employee Interface
    @Override
    public void criminalRecord(){
        System.out.println( "Employee has be given a background check");
    }
    @Override
    public void reasonForLeavingPreviousJob(){
        System.out.println(" Employee must give a solid and brief explanation on why he/she left their previous job ");
    }
    @Override
    public void goalIn5Years(){
        System.out.println(" Employee's goals in 5 years");
    }

    @Override
    public void questionInMind(){
        System.out.println(" Employee's question before joining the company");
    }


    private static class DateConversion {

        public DateConversion(Months months) {
        }

        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }

        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 7;
                    break;
                case August:
                    date = 8;
                    break;
                case September:
                    date = 9;
                    break;
                case October:
                    date = 10;
                    break;
                case November:
                    date = 11;
                    break;
                case December:
                    date = 12;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }
}
