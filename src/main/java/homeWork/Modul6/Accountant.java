package homeWork.Modul6;

public class Accountant extends Employee {
    public Accountant (String empName, int empId, String empDob,  String empAddress) {
        super(empName, empId,  Constants.ACCOUNTANT_TYPE, empDob, Constants.ACCOUNTANT_SALARY , empAddress);
    }

    public void openAccount(){
        System.out.println("The account was opened by " + getName());
    }

    public void closeAccount (String empName){
        System.out.println("The account was closed by " + empName);
    }

    public void createReport(String empName){
        System.out.println("The report was created by " + empName);
    }

}
