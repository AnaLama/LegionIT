package homeWork.Modul6;

public class Managers extends Employee{

    public Managers(String empName, int empId, String empDob,  String empAddress) {
        super(empName, empId, Constants.MANAGER_TYPE, empDob, Constants.MANAGER_SALARY , empAddress);
    }

    public void hireEmp (String empName){
        System.out.println(String.format("The employee %s was hired", empName));
    }
    public void fireEmp (String empName){
        System.out.println(String.format("The employee %s was fired", empName));
    }
}
