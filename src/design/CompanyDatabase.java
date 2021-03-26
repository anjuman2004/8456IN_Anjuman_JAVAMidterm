package design;

public abstract class CompanyDatabase implements Employee {
    public CompanyDatabase(String partyDate, String managerName, int dobCompany) {
    }

    public CompanyDatabase(String companyWebsite, double v, boolean b, int employeeAge, int i) {
    }

    public CompanyDatabase(int employeeId) {
    }

    public CompanyDatabase() {
    }

    public static void main(String[] args) {
        String partyDate;
        String managerName;
        int dobOfCompany;
        String companyTransportation;
        long companyFax;
    }

    //Abstract methods
    public abstract void companyUpcomingEvent();

    {
        System.out.println("Company will be having a event soon");
    }

    public abstract void annualPartyDate(String partydate);

    {
        System.out.println("The Company's annual will be on");
    }

}



















