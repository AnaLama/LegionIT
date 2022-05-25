package homeWork.Modul6;

public class Clerk extends Employee{

    public Clerk(String empName, int empId, String empDob,  String empAddress){
        super(empName, empId,  Constants.CLERK_TYPE, empDob, Constants.CLERK_SALARY , empAddress);
    }

    public void makeCall (String name){
        System.out.println(getName()+ " connected " + name);
    }
    public void answerCall (){
        System.out.println("The call was answered by " + getName());
    }
}
